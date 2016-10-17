package br.com.LeonardoMatheus.controller.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.repository.Atletas;

@Controller
@RequestMapping("/atleta")
public class alunosController {
	
	@Autowired
	public Atletas atleta;
	
	@RequestMapping
	public ModelAndView nomeAcesso(){
		ModelAndView mv = new ModelAndView("layout/consultarAtleta");
		mv.addObject("atletas",atleta.findAll());
		return mv;
	}
	
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
