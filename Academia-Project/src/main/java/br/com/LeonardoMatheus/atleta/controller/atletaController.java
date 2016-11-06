package br.com.LeonardoMatheus.atleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("/visualizar")
public class atletaController {

	@Autowired
	public Atletas atleta;

	@Autowired
	public AtletaService service;

	@RequestMapping("/atleta/estatisticas")
	public String estatisticaAtleta(){
		return "/layout/atleta/estatisticas";
	}
	
	@RequestMapping("/treino")
	public String treinoAtleta(){
		return "/layout/atleta/verTreino";
	}
}
