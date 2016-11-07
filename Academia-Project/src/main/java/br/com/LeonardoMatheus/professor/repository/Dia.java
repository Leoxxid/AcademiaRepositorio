package br.com.LeonardoMatheus.professor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;

public interface Dia extends CrudRepository<DiaModel, Long> {
	
	@Query("select new DiaModel(d.idDia,d.diaSemana) from DiaModel d where atleta.idAluno = ? order By d.diaSemana")
	List <DiaModel> diasdoAtleta(Long idAluno);
	
	List <DiaModel> findByAtletaIdAluno(Long idALuno); 

}
