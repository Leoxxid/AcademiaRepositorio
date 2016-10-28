package br.com.LeonardoMatheus.professor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;
import br.com.LeonardoMatheus.professor.repository.Exercicio;

@Service
public class ExercicioService {
	@Autowired
	public Exercicio exercico;
	public void save(ExercicioModel exercicioModel){
		this.exercico.save(exercicioModel);
	}

}
