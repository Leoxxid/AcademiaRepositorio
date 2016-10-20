package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.professor.model.AtletaModel;


public interface Atletas extends JpaRepository<AtletaModel, Integer> {

}
