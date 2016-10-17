package br.com.LeonardoMatheus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="acesso_web")
public class AtletaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ID_ACESSO")
	private int idAcesso;
	
	@Column(name="NOME_ACESSO")
	private String nome;
	
	@Column(name="SENHA_ACESSO")
	private String senha;
	
	@Column (name="ATIVACAO_ACESSO")
	private String ativacao;

	public int getIdAcesso() {
		return idAcesso;
	}

	public void setIdAcesso(int idAcesso) {
		this.idAcesso = idAcesso;
	}

	public String getNome() {
		return nome;
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
	
	

}
