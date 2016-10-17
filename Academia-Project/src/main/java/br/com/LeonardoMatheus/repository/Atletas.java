package br.com.LeonardoMatheus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.model.AtletaModel;

public interface Atletas extends JpaRepository<AtletaModel,Integer>{

}
