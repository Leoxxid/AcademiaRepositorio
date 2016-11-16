package br.com.LeonardoMatheus.professor.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.repository.Dia;
import br.com.LeonardoMatheus.professor.repository.DiaExercicio;
import br.com.LeonardoMatheus.professor.repository.Exercicio;
import br.com.LeonardoMatheus.professor.service.DiaExercicioService;
import br.com.LeonardoMatheus.professor.service.DiaService;

@Controller
@RequestMapping("/atletas")
public class TreinoAtletaController {

	@Autowired
	public DiaExercicioService diaExercicioService;
	
	@Autowired
	public DiaExercicio diaExercicio;

	@Autowired
	DiaService diaService;
	
	@Autowired
	Dia dia;
	
	@Autowired
	public Exercicio exercicio;

	@Autowired
	public Atletas atleta;

	@RequestMapping(value = "/treino/treino-do-atleta/{idAtleta}", method = RequestMethod.GET)
	public ModelAndView treinoAtleta(@PathVariable Long idAtleta) {
		ModelAndView mv = new ModelAndView("/layout/professor/criaTreino");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("atleta", diaExercicioService.selectAtletaAndId(idAtleta));
		model.put("exercicios", exercicio.findAll());
		List<DiaModel> diasDoTreino = diaExercicioService.findDiaAtleta(idAtleta);
		model.put("dias", diasDoTreino);
		List<DiaExercicioModel> treino = diaExercicioService.diaExercicioDoAtleta(diasDoTreino);
		model.put("treino", treino);
		mv.addAllObjects(model);

		return mv;
	}

	// Post da tela de cadastro de atleta
	@RequestMapping(value = "/treino/treino-do-atleta/{idAtleta}", method = RequestMethod.POST)
	public String cadastrar(@PathVariable Long idAtleta, DiaExercicioModel diaExercicioModel) {
		diaExercicioService.saveDiaExercicio(diaExercicioModel);
		return "redirect:/atletas/treino/treino-do-atleta/{idAtleta}";
	}

	@RequestMapping(value="delete-dia-treino/{idDiaExercicio}")
	public ModelAndView deletarDoDiaTreino(@PathVariable long idDiaExercicio){
		DiaExercicioModel diaExercicioModel = diaExercicio.findByIdDiaExercicio(idDiaExercicio);
		Long idAluno = diaExercicioModel.getDia().getAtleta().getIdAluno();
		diaExercicioService.delete(idDiaExercicio);
		ModelAndView mv = new ModelAndView("redirect:/atletas/treino/treino-do-atleta/"+ idAluno);
		String sucess = "delete-sucess";
		mv.addObject("delete", sucess);
		return mv;
	}
	

	// Dias que o aluno frequent a academia 
	@RequestMapping("/frequencia-academia/{idAtleta}")
	public ModelAndView diaTreino(@PathVariable Long idAtleta) {
		ModelAndView mv = new ModelAndView("/layout/professor/cadastroDia");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("atleta", diaExercicioService.selectAtletaAndId(idAtleta));
		List <DiaModel> diasModel = diaService.findDia(idAtleta);
		List<String> diasQueNaoVai = new ArrayList<>();
		System.out.println(diasQueNaoVai.size());
		diasQueNaoVai = diaService.diasQueNaoVai(diasModel);
		model.put("diasQueNaoVai", diasQueNaoVai);
		model.put("diasQueVai", diasModel);
		mv.addAllObjects(model);
		return mv;
	}
	@RequestMapping(value="/frequencia-academia/{idAtleta}", method = RequestMethod.POST)
	public ModelAndView adicionarDiaTreino(@PathVariable Long idAtleta, DiaModel diaModel){
		dia.save(diaModel);
		ModelAndView mv = new ModelAndView("redirect:/atletas/frequencia-academia/{idAtleta}");
		String sucesso="Dia adicionado com sucesso";
		mv.addObject("sucesso", sucesso);
		return mv;
	}
}
