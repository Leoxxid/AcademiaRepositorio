package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.ExercicioModel;

public interface Exercicio extends JpaRepository<ExercicioModel, Long>{

}
