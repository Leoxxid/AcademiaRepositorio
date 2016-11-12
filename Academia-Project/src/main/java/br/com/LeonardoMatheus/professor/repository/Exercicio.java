package br.com.LeonardoMatheus.professor.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;

public interface Exercicio extends CrudRepository<ExercicioModel, Long>{
	
	ExercicioModel findByIdExercicio(Long idExercicio);
	
}
