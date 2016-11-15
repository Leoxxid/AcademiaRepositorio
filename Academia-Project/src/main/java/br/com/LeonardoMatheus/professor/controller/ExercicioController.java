package br.com.LeonardoMatheus.professor.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Exercicio;
import br.com.LeonardoMatheus.professor.service.ExercicioService;

@Controller
@RequestMapping("/exercicio")
public class ExercicioController {

	@Autowired
	public ExercicioService service;

	@Autowired
	public Exercicio exercicio;

	private ExercicioModel exercicioModel = new ExercicioModel();

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	private ModelAndView novoExercicioG(ExercicioModel exercicioM) {
		ModelAndView mv = new ModelAndView("/layout/professor/cadastroExercicio");
		mv.addObject("exercicios", exercicio.findAll());
		return mv;
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

	@RequestMapping(value = "teste")
	public String teste() {
		return "/layout/professor/atualizarExercicio";
	}

	@RequestMapping(value = "deletar-exercicio/{idExercicio}")
	private ModelAndView deletarExercicio(@PathVariable Long idExercicio) {
		ModelAndView mv = new ModelAndView("redirect:/exercicio/novo");
		exercicio.delete(idExercicio);
		String sucess = "Exercicio deletado com sucesso";
		mv.addObject("delete", sucess);
		return mv;
	}

	// ========================================================== EDITAR EXERCICIO
	
	
	@RequestMapping(value = "/editar-exercicio/{idExercicio}")
	public ModelAndView editarExercicioGET(@PathVariable Long idExercicio, ExercicioModel exercicioModel) {
		ModelAndView mv = new ModelAndView("/layout/professor/atualizarExercicio");
		exercicioModel = exercicio.findByIdExercicio(idExercicio);
		mv.addObject("exercicio", exercicioModel);
		return mv;
	}
	
	@RequestMapping(value = "/editar-exercicio/{idExercicio}", method = RequestMethod.POST)
	public ModelAndView editarExercicioPOST(@PathVariable Long idExercicio, @Valid ExercicioModel exercicioModel,
			BindingResult bindingResult, RedirectAttributes attributes){
		
		if (bindingResult.hasErrors()) {
			return erroAoEditarExercicio(idExercicio, exercicioModel);
		}
		service.save(exercicioModel);
		ModelAndView mv= new ModelAndView ("redirect:/exercicio/editar-exercicio/" + idExercicio);
		mv.addObject("sucesso", "O exercicio foi salvo com sucesso");
		return mv;
	}
	
	@RequestMapping(value = "/editar-exercicio/{idExercicio}/erro")
	public ModelAndView erroAoEditarExercicio(@PathVariable Long idExercicio, ExercicioModel exercicioModel){
		ModelAndView mv = new ModelAndView("/layout/professor/atualizarExercicio");
		mv.addObject("exercicio", exercicioModel);
		return mv; 
	}
	

}
