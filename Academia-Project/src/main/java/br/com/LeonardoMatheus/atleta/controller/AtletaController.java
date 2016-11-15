package br.com.LeonardoMatheus.atleta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.LeonardoMatheus.atleta.model.AcessoWebModel;
import br.com.LeonardoMatheus.atleta.repository.AcessoWeb;
import br.com.LeonardoMatheus.atleta.service.PerfilAtletaService;
import br.com.LeonardoMatheus.atleta.service.TreinoAtletaService;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("academia/visualizar")
public class AtletaController {

	@Autowired
	public AcessoWeb acessoWeb;

	@Autowired
	public PerfilAtletaService perfilAtletaService;

	@Autowired
	public AtletaService service;
	
	@Autowired
	public TreinoAtletaService TreinoAtletaService;

	@RequestMapping("/treino")
	public ModelAndView treinoAtleta() {
		List<DiaExercicioModel> DiaExercicioList = TreinoAtletaService.buscarTreino();
		ModelAndView mv = new ModelAndView("/layout/atleta/verTreino");
		mv.addObject("treino", DiaExercicioList);
		return mv;
	}

	@RequestMapping(value = "/perfil")
	public ModelAndView retornarPerfil() {
		String username = perfilAtletaService.usuarioLogado();
		AcessoWebModel usuario = acessoWeb.procurarPerfil(username);
		ModelAndView mv = new ModelAndView("/layout/atleta/perfilAtleta");
		mv.addObject("perfil", usuario);
		return mv;
	}

}
