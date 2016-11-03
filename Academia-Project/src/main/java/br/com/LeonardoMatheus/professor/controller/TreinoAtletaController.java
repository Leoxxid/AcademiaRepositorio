package br.com.LeonardoMatheus.professor.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.repository.Exercicio;
import br.com.LeonardoMatheus.professor.service.AtletaService;
import br.com.LeonardoMatheus.professor.service.DiaExercicioService;
import br.com.LeonardoMatheus.professor.service.DiaService;


@Controller
@RequestMapping("/treino")
public class TreinoAtletaController {
	
	@Autowired
	public DiaExercicioService diaExercicioService;
	
	@Autowired
	public Exercicio exercicio;
	
	@Autowired 
	public Atletas atleta;
	
	@RequestMapping("/atletas")
	public String atleta(){
		return "";
	}
	
	@RequestMapping("/atletas/treino-do-atleta/{idAtleta}")
	public ModelAndView treinoAtleta(@PathVariable Long idAtleta){
		ModelAndView mv = new ModelAndView("/layout/professor/criaTreino");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("atleta", diaExercicioService.findAtletaById(idAtleta));
		model.put("exercicos", exercicio.findAll());
		for (ExercicioModel a : exercicio.findAll()) {
		System.out.println(a.getNomeExercicio());	
		}
		mv.addAllObjects(model);
		return mv;
	}
	
	@RequestMapping("/atletas/cadastraDia")
	public String diaTreino(){
		return "/layout/professor/cadastroDia";
	}

}
