package br.com.LeonardoMatheus.professor.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("/atleta")
public class alunosController {

	@Autowired
	public Atletas atleta;

	@Autowired
	public AtletaService service;

	// Exibe todos atletas
	@RequestMapping(value = "/todos")
	public ModelAndView nomeAcesso() {
		ModelAndView mv = new ModelAndView("layout/professor/consultarAtleta");
		mv.addObject("atletas", atleta.findAll());
		return mv;
	}
	
	//''''''''''''''''''''''''''''''''''''''''''''''''''
	//													NOVO
	// Get da tela de cadastro de atleta
	@RequestMapping("/novo")
	public String cadastrar(AtletaModel atletaModel) {
		return "layout/professor/cadastraAtleta";
	}

	// Realiza o cadastro de atleta
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String criar(@Valid AtletaModel atletaModel) {
		service.save(atletaModel);
		return "redirect:/atleta/todos";
	}
	
	//''''''''''''''''''''''''''''''''''''''''''''''''''

	// Visualizar perfil do atleta
	@RequestMapping(value = "/perfil-do-atleta/{idAtleta}")
	public ModelAndView perfilAtleta(@PathVariable Long idAtleta) {
		AtletaModel atletaModel = new AtletaModel(); 
		atletaModel = service.findById(idAtleta);
		ModelAndView mv = new ModelAndView("layout/professor/atualizarAtleta");
		mv.addObject("atleta", atletaModel);
		
		return mv;
	}

	@RequestMapping(value = "deletar-atleta/{idAtleta}")
	public ModelAndView deletarAtleta(@PathVariable Long idAtleta) {
		System.out.println(idAtleta);
		service.delete(idAtleta);
		ModelAndView mv = new ModelAndView("redirect:/atleta/todos");
		String sucess="delete-sucess";
		mv.addObject("delete", sucess);
		return mv;
	}

	@RequestMapping (value = "/atualizar-atleta")
	public String atualizar(AtletaModel atletaModel){
		service.save(atletaModel);
		return"";
	}

}
