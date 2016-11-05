package br.com.LeonardoMatheus.professor.controller;




import java.util.HashMap;
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
import br.com.LeonardoMatheus.professor.repository.Exercicio;
import br.com.LeonardoMatheus.professor.service.DiaExercicioService;
import br.com.LeonardoMatheus.professor.service.DiaService;

@Controller
@RequestMapping("/atletas")
public class TreinoAtletaController {

	@Autowired
	public DiaExercicioService diaExercicioService;
	
	@Autowired
	DiaService diaService;
	
	@Autowired
	public Exercicio exercicio;

	@Autowired
	public Atletas atleta;

	@RequestMapping(value="/treino/treino-do-atleta/{idAtleta}", method=RequestMethod.GET)
	public ModelAndView treinoAtleta(@PathVariable Long idAtleta) {
		ModelAndView mv = new ModelAndView("/layout/professor/criaTreino");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("atleta", diaExercicioService.selectAtletaAndId(idAtleta));
		model.put("exercicios", exercicio.findAll());
		model.put("dias", diaExercicioService.findDiaAtleta(idAtleta));
		mv.addAllObjects(model);
		return mv;
	}
	
	// Get da tela de cadastro de atleta
		@RequestMapping(value="/treino/treino-do-atleta", method=RequestMethod.POST)
		public String cadastrar(DiaExercicioModel diaExercicioModel) {
			diaExercicioService.saveDiaExercicio(diaExercicioModel);
			return "/acesso";
		}

	@RequestMapping("/frequencia-academia/{idAtleta}")
	public ModelAndView diaTreino(@PathVariable Long idAtleta) {
		ModelAndView mv = new ModelAndView("/layout/professor/cadastroDia");
		Map<String, Object> model = new HashMap<String , Object>();
		model.put("atleta", diaExercicioService.selectAtletaAndId(idAtleta));
		model.put("dias", diaService.findDia(idAtleta));
		mv.addAllObjects(model);
 		return mv;
	}

}
