package br.com.LeonardoMatheus.professor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.repository.Dia;

@Service
public class DiaService {
	 
	
	@Autowired
	public Dia dia;
	
	public List<DiaModel> findDia(Long idAtleta){
		List <DiaModel>diaModel = this.dia.findByAtletaIdAluno(idAtleta);
		return diaModel;
	}

}
