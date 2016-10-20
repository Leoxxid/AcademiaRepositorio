package br.com.LeonardoMatheus.professor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="cadastro_aluno")
public class AtletaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ALUNO")
	private int idALuno; 
	
	@Column(name="MATRICULA_ALUNO")
	private String matriculaAluno; 
	
	@Column (name="NOME_ALUNO")
	private String nomeAluno;
	
	@Column(name="NASC_ALUNO")
	private Date nascAluno;

	public int getIdALuno() {
		return idALuno;
	}

	public void setIdALuno(int idALuno) {
		this.idALuno = idALuno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Date getNascAluno() {
		return nascAluno;
	}

	public void setNascAluno(Date nascAluno) {
		this.nascAluno = nascAluno;
	}
	

}
