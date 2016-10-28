package br.com.LeonardoMatheus.professor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;

@Service
public class AtletaService {
	@Autowired
	public Atletas atleta; 
	
	public void save(AtletaModel atletaModel){
		this.atleta.save(atletaModel);
	}
}
