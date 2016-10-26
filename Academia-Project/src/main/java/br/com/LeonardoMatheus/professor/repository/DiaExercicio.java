package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;

public interface DiaExercicio extends JpaRepository<DiaExercicioModel, Long>{

}
