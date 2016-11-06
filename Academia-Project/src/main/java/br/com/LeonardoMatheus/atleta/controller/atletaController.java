package br.com.LeonardoMatheus.atleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("/visualizar")
public class atletaController {

	@Autowired
	public Atletas atleta;

	@Autowired
	public AtletaService service;
	
	@RequestMapping("/atleta/index")
	public String indexAtleta(){
		return "/layout/atleta/index";
	}
	
	@RequestMapping("/treino")
	public String treinoAtleta(){
		return "/layout/atleta/verTreino";
	}
	
	@RequestMapping(value="/perfil")
	public String retornarPerfil(){
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String nomeUser = user.getName();
		System.out.println(nomeUser);
		return "/layout/atleta/verTreino";
	}
	
}
