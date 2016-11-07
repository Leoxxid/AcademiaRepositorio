package br.com.LeonardoMatheus.atleta.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.LeonardoMatheus.atleta.model.AcessoWebModel;

public interface AcessoWeb extends CrudRepository<AcessoWebModel, Long>{
	@Query ("select new AcessoWebModel( a.nome, atletaWeb) from AcessoWebModel a where a.nome = ?")
	AcessoWebModel procurarPerfil(String nomeUsuario); 
}
