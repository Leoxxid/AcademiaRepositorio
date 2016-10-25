package br.com.LeonardoMatheus.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoMatheus.professor.model.avaliacaoAtleta.ComposicaoCorporalModel;

public interface ComposicaoCorporal extends JpaRepository<ComposicaoCorporalModel, Long>{

}
