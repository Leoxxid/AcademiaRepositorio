package br.com.LeonardoMatheus.atleta.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

import br.com.LeonardoMatheus.professor.model.AtletaModel;

@Entity
@Table(name = "cadastro_aluno")
public class PerfilModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUNO")
	private Long idAluno;

	@NotBlank
	@Column(name = "MATRICULA_ALUNO", length = 40)
	private String matriculaAluno;

	@NotBlank
	@Column(name = "NOME_ALUNO", length = 45)
	private String nomeAluno;

	@Column(name = "NASC_ALUNO")
	private Date nascAluno;

	@Column(name = "RG_ALUNO")
	private String rg;

	@Column(name = "CPF_ALUNO", length = 15)
	private String cpf;

	@OneToMany(fetch=FetchType.LAZY, mappedBy = "atleta")
	List<AtletaModel> atleta;

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<AtletaModel> getAtleta() {
		return atleta;
	}

	public void setAtleta(List<AtletaModel> atleta) {
		this.atleta = atleta;
	}
	
	
	
}
