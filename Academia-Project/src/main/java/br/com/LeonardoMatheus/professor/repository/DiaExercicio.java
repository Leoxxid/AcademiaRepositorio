package br.com.LeonardoMatheus.professor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;

public interface DiaExercicio extends CrudRepository<DiaExercicioModel, Long>{
	
	List<DiaExercicioModel> findByDiaIdDia(Long idDIa);

}
