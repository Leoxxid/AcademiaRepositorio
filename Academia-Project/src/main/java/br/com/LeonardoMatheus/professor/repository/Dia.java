package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;

public interface Dia extends JpaRepository<DiaModel,Long>{

}
