package br.com.LeonardoMatheus.professor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;


@Controller
@RequestMapping("/treino")
public class TreinoAtletaController {
	
	@Autowired
	public AtletaService atletaService;
	
	@Autowired 
	public Atletas atleta;
	
	@RequestMapping("/atletas")
	public String atleta(){
		return "";
	}
	
	@RequestMapping("/atletas/treino-do-atleta/{idAtleta}")
	public ModelAndView treinoAtleta(@PathVariable Long idAtleta){
		ModelAndView mv = new ModelAndView("/layout/professor/criaTreino");
		mv.addObject("atleta", atletaService.findById(idAtleta));
		return mv;
	}
	
	@RequestMapping("/atletas/cadastraDia")
	public String diaTreino(){
		return "/layout/professor/cadastroDia";
	}

}
