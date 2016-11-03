package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.professor.model.AtletaModel;
import java.lang.String;
import java.util.List;


public interface Atletas extends CrudRepository<AtletaModel, Long> {
	AtletaModel  findByIdAluno(Long idAluno); 

}
