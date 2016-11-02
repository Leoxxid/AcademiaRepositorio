package br.com.LeonardoMatheus.professor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/avaliacao")
public class avaliaAtleta {
	
	@RequestMapping("/atletas")
	public String atleta(){
		return "";
	}
	
	@RequestMapping("/atletas/avaliaAtleta")
	public String treinoAtleta(){
		return "/layout/professor/avaliaAtleta";
	}

}

