package br.com.LeonardoMatheus.professor.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.repository.DiaExercicio;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("/atleta")
public class alunosController {

	@Autowired
	public Atletas atleta;

	@Autowired
	public AtletaService service;

	@RequestMapping(value = "/todos")
	public ModelAndView nomeAcesso() {
		ModelAndView mv = new ModelAndView("layout/consultarAtleta");
		mv.addObject("atletas", atleta.findAll());
		return mv;
	}

	// Cadastrar novo Atleta
	@RequestMapping("/novo")
	public String cadastrar(AtletaModel atletaModel) {
		return "layout/cadastraAtleta";
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String criar(@Valid AtletaModel atletaModel) {
		service.save(atletaModel);
		return "redirect:/atleta/todos";
	}

	// Visualizar perfil do atleta
	@RequestMapping(value = "/perfil-do-atleta")
	public String perfilAtleta() {

		return "perfilAtleta";
	}
}
