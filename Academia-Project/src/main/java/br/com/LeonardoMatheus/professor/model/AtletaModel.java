package br.com.LeonardoMatheus.professor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cadastro_aluno")
public class AtletaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUNO")
	private Long idALuno;
	
	@NotNull
	@Column(name = "MATRICULA_ALUNO", length = 40)
	private String matriculaAluno;

	@Column(name = "NOME_ALUNO", length = 45)
	private String nomeAluno;

	@Column(name = "NASC_ALUNO")
	private Date nascAluno;

	@Column(name = "RG_ALUNO")
	private int rg;

	@Column(name = "CPF_ALUNO", length = 11)
	private int cpf;

	@Column(name = "ESTADO", length = 2)
	private String estado;

	@Column(name = "CIDADE", length = 30)
	private String cidade;

	@Column(name = "BAIRRO", length = 25)
	private String bairro;

	@Column(name = "RUA", length = 30)
	private String rua;

	@Column(name = "NUMERO_CASA", length = 7)
	private int numeroCasa;

	@Column(name = "COMPLEMENTO", length = 20)
	private String complemento;

	@Column(name = "TELEFONE_CASA", length = 13)
	private String telefoneCasa;

	@Column(name = "TELEFONE_CEL", length = 14)
	private String telefoneCelular;

	@Column(name = "DATA_MATRICULA")
	private Date dataMatricula;

	// ===== GETTERS AND SETTERS

	public Long getIdALuno() {
		return idALuno;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefoneCasa() {
		return telefoneCasa;
	}

	public void setTelefoneCasa(String telefoneCasa) {
		this.telefoneCasa = telefoneCasa;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void setIdALuno(Long idALuno) {
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
