package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the composicao_corporal database table.
 * 
 */
@Entity
@Table(name="composicao_corporal")
@NamedQuery(name="ComposicaoCorporal.findAll", query="SELECT c FROM ComposicaoCorporal c")
public class ComposicaoCorporal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_COMPOSICAO_CORPORAL")
	private int idComposicaoCorporal;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_AVALIACAO")
	private Date dataAvaliacao;

	private int estatura;

	@Column(name="PESO_TOTAL")
	private int pesoTotal;

	@Column(name="PRESSAO_ARTERIAL")
	private String pressaoArterial;

	//bi-directional many-to-one association to CadastroAluno
	@ManyToOne
	@JoinColumn(name="ALUNO")
	private CadastroAluno cadastroAluno;

	//bi-directional many-to-one association to DobrasCutanea
	@OneToMany(mappedBy="composicaoCorporalBean")
	private List<DobrasCutanea> dobrasCutaneas;

	//bi-directional many-to-one association to Perimetro
	@OneToMany(mappedBy="composicaoCorporalBean")
	private List<Perimetro> perimetros;

	public ComposicaoCorporal() {
	}

	public int getIdComposicaoCorporal() {
		return this.idComposicaoCorporal;
	}

	public void setIdComposicaoCorporal(int idComposicaoCorporal) {
		this.idComposicaoCorporal = idComposicaoCorporal;
	}

	public Date getDataAvaliacao() {
		return this.dataAvaliacao;
	}

	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public int getEstatura() {
		return this.estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getPesoTotal() {
		return this.pesoTotal;
	}

	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public String getPressaoArterial() {
		return this.pressaoArterial;
	}

	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

	public CadastroAluno getCadastroAluno() {
		return this.cadastroAluno;
	}

	public void setCadastroAluno(CadastroAluno cadastroAluno) {
		this.cadastroAluno = cadastroAluno;
	}

	public List<DobrasCutanea> getDobrasCutaneas() {
		return this.dobrasCutaneas;
	}

	public void setDobrasCutaneas(List<DobrasCutanea> dobrasCutaneas) {
		this.dobrasCutaneas = dobrasCutaneas;
	}

	public DobrasCutanea addDobrasCutanea(DobrasCutanea dobrasCutanea) {
		getDobrasCutaneas().add(dobrasCutanea);
		dobrasCutanea.setComposicaoCorporalBean(this);

		return dobrasCutanea;
	}

	public DobrasCutanea removeDobrasCutanea(DobrasCutanea dobrasCutanea) {
		getDobrasCutaneas().remove(dobrasCutanea);
		dobrasCutanea.setComposicaoCorporalBean(null);

		return dobrasCutanea;
	}

	public List<Perimetro> getPerimetros() {
		return this.perimetros;
	}

	public void setPerimetros(List<Perimetro> perimetros) {
		this.perimetros = perimetros;
	}

	public Perimetro addPerimetro(Perimetro perimetro) {
		getPerimetros().add(perimetro);
		perimetro.setComposicaoCorporalBean(this);

		return perimetro;
	}

	public Perimetro removePerimetro(Perimetro perimetro) {
		getPerimetros().remove(perimetro);
		perimetro.setComposicaoCorporalBean(null);

		return perimetro;
	}

}