package br.com.LeonardoMatheus.professor.controller;

import org.springframework.validation.Validator;
import java.util.jar.Attributes;

import javax.validation.Valid;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.aspectj.weaver.bcel.AtAjAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;
import br.com.LeonardoMatheus.professor.service.ExercicioService;

@Controller
@RequestMapping("/exercicio")
public class ExercicioController {

	@Autowired
	public ExercicioService service;

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	private ModelAndView novoExercicioG(ExercicioModel exercicioM) {
		return new ModelAndView("/layout/professor/cadastroExercicio");
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	private ModelAndView novoExercicioP(@Valid ExercicioModel exercicioModel, BindingResult bindingResult,
			RedirectAttributes attributes) {
		if (bindingResult.hasErrors()) {
			return novoExercicioG(exercicioModel);
		}
		service.save(exercicioModel);
		attributes.addFlashAttribute("sucesso", "O exercicio foi salvo com sucesso");
		return new ModelAndView("redirect:/exercicio/novo");
	}
}
