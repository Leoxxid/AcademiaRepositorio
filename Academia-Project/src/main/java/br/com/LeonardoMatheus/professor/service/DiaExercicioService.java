package br.com.LeonardoMatheus.professor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;

@Service
public class DiaExercicioService {
	@Autowired
	Atletas atleta;

	public AtletaModel findAtletaById(Long idAtleta) {

		AtletaModel atletaModel = this.atleta.selectNomeAndMatricula(idAtleta);
		return atletaModel;
	}

}
