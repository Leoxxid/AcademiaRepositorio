package br.com.LeonardoMatheus.professor.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import br.com.LeonardoMatheus.professor.model.AtletaModel;

public interface Atletas extends CrudRepository<AtletaModel, Long> {
	
	
	//Atleta completo
	AtletaModel findByIdAluno(Long idAluno);
	
	
	
	//Matricula e Nome
	@Query("select new AtletaModel(a.idAluno, a.matriculaAluno , a.nomeAluno) from AtletaModel a where a.idAluno = ?")
	AtletaModel selectNomeAndMatricula(Long idAluno);

}
