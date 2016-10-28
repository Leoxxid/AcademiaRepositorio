package br.com.LeonardoMatheus.professor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;

@Controller
@RequestMapping("/exercicio")
public class ExercicioController {

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	private String novoExercicioG() {

		return "/layout/professor/cadastroExercicio";
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	private String novoExercicioP() {
		return "layout/professor/cadastroExercicio";
	}
}
