package br.com.LeonardoMatheus.professor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/treino")
public class TreinoAtletaController {
	
	@RequestMapping("/atletas")
	public String atleta(){
		return "";
	}
	
	@RequestMapping("/atletas/treino-do-atleta")
	public String treinoAtleta(){
		return "/layout/professor/criaTreino";
	}

}
