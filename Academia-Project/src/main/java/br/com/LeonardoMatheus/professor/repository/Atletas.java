package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.professor.model.AtletaModel;


public interface Atletas extends CrudRepository<AtletaModel, Long> {

}
