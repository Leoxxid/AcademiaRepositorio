package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dobras_cutaneas database table.
 * 
 */
@Entity
@Table(name="dobras_cutaneas")
@NamedQuery(name="DobrasCutanea.findAll", query="SELECT d FROM DobrasCutanea d")
public class DobrasCutanea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DOBRAS_CUTANEAS")
	private int idDobrasCutaneas;

	private int abdominal;

	@Column(name="AXILAR_MEDIAL")
	private int axilarMedial;

	private int biceps;

	@Column(name="COXA_MEDIAL")
	private int coxaMedial;

	@Column(name="COXA_PROXIMAL")
	private int coxaProximal;

	private int panturrilha;

	private int peitoral;

	private int subescapular;

	@Column(name="SUPRA_ILIACA")
	private int supraIliaca;

	private int tricips;

	//bi-directional many-to-one association to ComposicaoCorporal
	@ManyToOne
	@JoinColumn(name="COMPOSICAO_CORPORAL")
	private ComposicaoCorporal composicaoCorporalBean;

	public DobrasCutanea() {
	}

	public int getIdDobrasCutaneas() {
		return this.idDobrasCutaneas;
	}

	public void setIdDobrasCutaneas(int idDobrasCutaneas) {
		this.idDobrasCutaneas = idDobrasCutaneas;
	}

	public int getAbdominal() {
		return this.abdominal;
	}

	public void setAbdominal(int abdominal) {
		this.abdominal = abdominal;
	}

	public int getAxilarMedial() {
		return this.axilarMedial;
	}

	public void setAxilarMedial(int axilarMedial) {
		this.axilarMedial = axilarMedial;
	}

	public int getBiceps() {
		return this.biceps;
	}

	public void setBiceps(int biceps) {
		this.biceps = biceps;
	}

	public int getCoxaMedial() {
		return this.coxaMedial;
	}

	public void setCoxaMedial(int coxaMedial) {
		this.coxaMedial = coxaMedial;
	}

	public int getCoxaProximal() {
		return this.coxaProximal;
	}

	public void setCoxaProximal(int coxaProximal) {
		this.coxaProximal = coxaProximal;
	}

	public int getPanturrilha() {
		return this.panturrilha;
	}

	public void setPanturrilha(int panturrilha) {
		this.panturrilha = panturrilha;
	}

	public int getPeitoral() {
		return this.peitoral;
	}

	public void setPeitoral(int peitoral) {
		this.peitoral = peitoral;
	}

	public int getSubescapular() {
		return this.subescapular;
	}

	public void setSubescapular(int subescapular) {
		this.subescapular = subescapular;
	}

	public int getSupraIliaca() {
		return this.supraIliaca;
	}

	public void setSupraIliaca(int supraIliaca) {
		this.supraIliaca = supraIliaca;
	}

	public int getTricips() {
		return this.tricips;
	}

	public void setTricips(int tricips) {
		this.tricips = tricips;
	}

	public ComposicaoCorporal getComposicaoCorporalBean() {
		return this.composicaoCorporalBean;
	}

	public void setComposicaoCorporalBean(ComposicaoCorporal composicaoCorporalBean) {
		this.composicaoCorporalBean = composicaoCorporalBean;
	}

}