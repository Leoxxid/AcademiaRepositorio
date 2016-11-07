package br.com.LeonardoMatheus.atleta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.LeonardoMatheus.atleta.model.AcessoWebModel;
import br.com.LeonardoMatheus.atleta.repository.AcessoWeb;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.service.DiaExercicioService;
import br.com.LeonardoMatheus.professor.service.DiaService;

public class TreinoAtletaService {
	
	@Autowired
	public AcessoWeb acessoWeb;
	
	@Autowired
	PerfilAtletaService perfilAtletaService;
	
	@Autowired
	DiaService diaService;
	
	@Autowired
	DiaExercicioService diaExercicioService;
	
	public List<DiaExercicioModel> buscarTreino(){
		String username = perfilAtletaService.usuarioLogado();
		AcessoWebModel usuario = acessoWeb.procurarPerfil(username);
		List <DiaModel>diaModel = diaService.findDia(usuario.getAtletaWeb().getIdAluno());
		List<DiaExercicioModel> diaExercicioList = diaExercicioService.diaExercicioDoAtleta(diaModel);
		return diaExercicioList;
	}

}
