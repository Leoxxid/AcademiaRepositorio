package br.com.LeonardoMatheus.professor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;

@Service
@Transactional
public class AtletaService {
	@Autowired
	public Atletas atleta;
	
	
	public AtletaModel atletaModel;
	
	public void save(AtletaModel atletaModel) {
		this.atleta.save(atletaModel);
	}

	public void delete(Long idAtleta){
	this.atleta.delete(idAtleta);
	}
	
	public AtletaModel findById(Long idAtleta){
		atletaModel = this.atleta.findByIdAluno(idAtleta);
		return atletaModel;
	}
}