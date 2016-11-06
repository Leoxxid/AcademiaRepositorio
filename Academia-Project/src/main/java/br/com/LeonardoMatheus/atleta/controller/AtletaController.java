package br.com.LeonardoMatheus.atleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.LeonardoMatheus.atleta.model.AcessoWebModel;
import br.com.LeonardoMatheus.atleta.repository.AcessoWeb;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.service.AtletaService;

@Controller
@RequestMapping("/visualizar")
public class AtletaController {
	

	@Autowired
	public AcessoWeb acessoWeb;

	@Autowired
	public AtletaService service;

	@RequestMapping("/atleta/index")
	public String indexAtleta() {
		return "/layout/atleta/index";
	}

	@RequestMapping("/treino")
	public String treinoAtleta() {
		return "/layout/atleta/verTreino";
	}

	@RequestMapping(value = "/perfil")
	public String retornarPerfil() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			AcessoWebModel usuario = acessoWeb.findByNome(username);
			System.out.println(usuario.getSenha());
			return "/layout/atleta/verTreino";
		} else {
			String username = principal.toString();
			return "/layout/atleta/verTreino";
		}

	}

}
