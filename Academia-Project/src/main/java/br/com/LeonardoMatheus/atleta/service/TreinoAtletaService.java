package br.com.LeonardoMatheus.atleta.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.LeonardoMatheus.atleta.model.AcessoWebModel;
import br.com.LeonardoMatheus.atleta.repository.AcessoWeb;
import br.com.LeonardoMatheus.professor.service.DiaService;

public class TreinoAtletaService {
	
	@Autowired
	public AcessoWeb acessoWeb;
	
	@Autowired
	PerfilAtletaService perfilAtletaService;
	
	@Autowired
	DiaService diaService;
	
	public void buscarTreino(){
		String username = perfilAtletaService.usuarioLogado();
		AcessoWebModel usuario = acessoWeb.procurarPerfil(username);
		diaService.
	}

}
