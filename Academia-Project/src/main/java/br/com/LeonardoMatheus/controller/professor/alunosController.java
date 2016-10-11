package br.com.LeonardoMatheus.controller.professor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/atleta")
public class alunosController {
	
	@RequestMapping("/novo")
	public String cadastrar() {
		return "layout/cadastraAtleta";
	}

	// Busca todos atletas matriculados
	@RequestMapping("/todos-atletas")
	public void listarAtletas() {

	}

	// Busca de atleta
	@RequestMapping("/atleta-por-matricula")
	public void pesquisarAtleta() {

	}

	@RequestMapping("/perfil-do-atleta")
	public void perfilAtleta() {

	}
}
