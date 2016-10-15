package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cadastro_aluno database table.
 * 
 */
@Entity
@Table(name="cadastro_aluno")
@NamedQuery(name="CadastroAluno.findAll", query="SELECT c FROM CadastroAluno c")
public class CadastroAluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ALUNO")
	private int idAluno;

	private String bairro;

	private String cidade;

	private String complemento;

	@Column(name="CPF_ALUNO")
	private int cpfAluno;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_MATRICULA")
	private Date dataMatricula;

	private String estado;

	@Column(name="MATRICULA_ALUNO")
	private String matriculaAluno;

	@Temporal(TemporalType.DATE)
	@Column(name="NASC_ALUNO")
	private Date nascAluno;

	@Column(name="NOME_ALUNO")
	private String nomeAluno;

	@Column(name="NUMERO_CASA")
	private int numeroCasa;

	@Column(name="RG_ALUNO")
	private int rgAluno;

	private String rua;

	@Column(name="TELEFONE_CASA")
	private String telefoneCasa;

	@Column(name="TELEFONE_CEL")
	private String telefoneCel;

	//bi-directional many-to-one association to AcessoWeb
	@OneToMany(mappedBy="cadastroAluno")
	private List<AcessoWeb> acessoWebs;

	//bi-directional many-to-one association to ComposicaoCorporal
	@OneToMany(mappedBy="cadastroAluno")
	private List<ComposicaoCorporal> composicaoCorporals;

	//bi-directional many-to-one association to DiaTreino
	@OneToMany(mappedBy="cadastroAluno")
	private List<DiaTreino> diaTreinos;

	public CadastroAluno() {
	}

	public int getIdAluno() {
		return this.idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCpfAluno() {
		return this.cpfAluno;
	}

	public void setCpfAluno(int cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public Date getDataMatricula() {
		return this.dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMatriculaAluno() {
		return this.matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public Date getNascAluno() {
		return this.nascAluno;
	}

	public void setNascAluno(Date nascAluno) {
		this.nascAluno = nascAluno;
	}

	public String getNomeAluno() {
		return this.nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getNumeroCasa() {
		return this.numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public int getRgAluno() {
		return this.rgAluno;
	}

	public void setRgAluno(int rgAluno) {
		this.rgAluno = rgAluno;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getTelefoneCasa() {
		return this.telefoneCasa;
	}

	public void setTelefoneCasa(String telefoneCasa) {
		this.telefoneCasa = telefoneCasa;
	}

	public String getTelefoneCel() {
		return this.telefoneCel;
	}

	public void setTelefoneCel(String telefoneCel) {
		this.telefoneCel = telefoneCel;
	}

	public List<AcessoWeb> getAcessoWebs() {
		return this.acessoWebs;
	}

	public void setAcessoWebs(List<AcessoWeb> acessoWebs) {
		this.acessoWebs = acessoWebs;
	}

	public AcessoWeb addAcessoWeb(AcessoWeb acessoWeb) {
		getAcessoWebs().add(acessoWeb);
		acessoWeb.setCadastroAluno(this);

		return acessoWeb;
	}

	public AcessoWeb removeAcessoWeb(AcessoWeb acessoWeb) {
		getAcessoWebs().remove(acessoWeb);
		acessoWeb.setCadastroAluno(null);

		return acessoWeb;
	}

	public List<ComposicaoCorporal> getComposicaoCorporals() {
		return this.composicaoCorporals;
	}

	public void setComposicaoCorporals(List<ComposicaoCorporal> composicaoCorporals) {
		this.composicaoCorporals = composicaoCorporals;
	}

	public ComposicaoCorporal addComposicaoCorporal(ComposicaoCorporal composicaoCorporal) {
		getComposicaoCorporals().add(composicaoCorporal);
		composicaoCorporal.setCadastroAluno(this);

		return composicaoCorporal;
	}

	public ComposicaoCorporal removeComposicaoCorporal(ComposicaoCorporal composicaoCorporal) {
		getComposicaoCorporals().remove(composicaoCorporal);
		composicaoCorporal.setCadastroAluno(null);

		return composicaoCorporal;
	}

	public List<DiaTreino> getDiaTreinos() {
		return this.diaTreinos;
	}

	public void setDiaTreinos(List<DiaTreino> diaTreinos) {
		this.diaTreinos = diaTreinos;
	}

	public DiaTreino addDiaTreino(DiaTreino diaTreino) {
		getDiaTreinos().add(diaTreino);
		diaTreino.setCadastroAluno(this);

		return diaTreino;
	}

	public DiaTreino removeDiaTreino(DiaTreino diaTreino) {
		getDiaTreinos().remove(diaTreino);
		diaTreino.setCadastroAluno(null);

		return diaTreino;
	}

}