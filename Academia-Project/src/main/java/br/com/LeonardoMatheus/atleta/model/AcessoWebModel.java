package br.com.LeonardoMatheus.atleta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.LeonardoMatheus.professor.model.AtletaModel;

@Entity
@Table(name = "acesso_web")
public class AcessoWebModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ACESSO")
	private Long idAcesso;

	@Column(name = "NOME_ACESSO")
	private String nome;

	@Column(name = "SENHA_ACESSO")
	private String senha;

	@Column(name = "ATIVACAO_ACESSO")
	private String ativacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	private AtletaModel atletaWeb = new AtletaModel();

	// Construtor
	public AcessoWebModel() {

	}

	public AcessoWebModel(String nome, AtletaModel atletaWeb) {
		this.nome = nome;
		this.atletaWeb = atletaWeb;
	}

	// ===== GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public Long getIdAcesso() {
		return idAcesso;
	}

	public void setIdAcesso(Long idAcesso) {
		this.idAcesso = idAcesso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getAtivacao() {
		return ativacao;
	}

	public void setAtivacao(String ativacao) {
		this.ativacao = ativacao;
	}

	public AtletaModel getAtletaWeb() {
		return atletaWeb;
	}

	public void setAtletaWeb(AtletaModel atletaWeb) {
		this.atletaWeb = atletaWeb;
	}
	

}
