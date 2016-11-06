package br.com.LeonardoMatheus.atleta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.atleta.model.PerfilModel;

public interface perfil extends CrudRepository<PerfilModel, Long>{

}
