package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acesso_web database table.
 * 
 */
@Entity
@Table(name="acesso_web")
@NamedQuery(name="AcessoWeb.findAll", query="SELECT a FROM AcessoWeb a")
public class AcessoWeb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ACESSO")
	private int idAcesso;

	@Column(name="ATIVACAO_ACESSO")
	private String ativacaoAcesso;

	@Column(name="NOME_ACESSO")
	private String nomeAcesso;

	@Column(name="SENHA_ACESSO")
	private String senhaAcesso;

	//bi-directional many-to-one association to CadastroAluno
	@ManyToOne
	@JoinColumn(name="ID_ALUNO")
	private CadastroAluno cadastroAluno;

	public AcessoWeb() {
	}

	public int getIdAcesso() {
		return this.idAcesso;
	}

	public void setIdAcesso(int idAcesso) {
		this.idAcesso = idAcesso;
	}

	public String getAtivacaoAcesso() {
		return this.ativacaoAcesso;
	}

	public void setAtivacaoAcesso(String ativacaoAcesso) {
		this.ativacaoAcesso = ativacaoAcesso;
	}

	public String getNomeAcesso() {
		return this.nomeAcesso;
	}

	public void setNomeAcesso(String nomeAcesso) {
		this.nomeAcesso = nomeAcesso;
	}

	public String getSenhaAcesso() {
		return this.senhaAcesso;
	}

	public void setSenhaAcesso(String senhaAcesso) {
		this.senhaAcesso = senhaAcesso;
	}

	public CadastroAluno getCadastroAluno() {
		return this.cadastroAluno;
	}

	public void setCadastroAluno(CadastroAluno cadastroAluno) {
		this.cadastroAluno = cadastroAluno;
	}

}