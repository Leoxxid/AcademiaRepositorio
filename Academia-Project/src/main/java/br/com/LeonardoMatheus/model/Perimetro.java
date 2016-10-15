package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the perimetros database table.
 * 
 */
@Entity
@Table(name="perimetros")
@NamedQuery(name="Perimetro.findAll", query="SELECT p FROM Perimetro p")
public class Perimetro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PERIMETROS")
	private int idPerimetros;

	@Column(name="PC_ABDOMINAL")
	private int pcAbdominal;

	@Column(name="PC_CINTURA")
	private int pcCintura;

	@Column(name="PC_QUADRIL")
	private int pcQuadril;

	@Column(name="PC_TORAX")
	private int pcTorax;

	@Column(name="PP_ANTEBRACO_D")
	private int ppAntebracoD;

	@Column(name="PP_ANTEBRACO_E")
	private int ppAntebracoE;

	@Column(name="PP_BRACO_CONTRAIDO_D")
	private int ppBracoContraidoD;

	@Column(name="PP_BRACO_CONTRAIDO_E")
	private int ppBracoContraidoE;

	@Column(name="PP_BRACO_RELAXADO_D")
	private int ppBracoRelaxadoD;

	@Column(name="PP_BRACO_RELAXADO_E")
	private int ppBracoRelaxadoE;

	@Column(name="PP_COXA_MEDIAL_D")
	private int ppCoxaMedialD;

	@Column(name="PP_COXA_MEDIAL_E")
	private int ppCoxaMedialE;

	@Column(name="PP_COXA_PROXIMAL_D")
	private int ppCoxaProximalD;

	@Column(name="PP_COXA_PROXIMAL_E")
	private int ppCoxaProximalE;

	@Column(name="PP_PANTURRILHA_D")
	private int ppPanturrilhaD;

	@Column(name="PP_PANTURRILHA_E")
	private int ppPanturrilhaE;

	//bi-directional many-to-one association to ComposicaoCorporal
	@ManyToOne
	@JoinColumn(name="COMPOSICAO_CORPORAL")
	private ComposicaoCorporal composicaoCorporalBean;

	public Perimetro() {
	}

	public int getIdPerimetros() {
		return this.idPerimetros;
	}

	public void setIdPerimetros(int idPerimetros) {
		this.idPerimetros = idPerimetros;
	}

	public int getPcAbdominal() {
		return this.pcAbdominal;
	}

	public void setPcAbdominal(int pcAbdominal) {
		this.pcAbdominal = pcAbdominal;
	}

	public int getPcCintura() {
		return this.pcCintura;
	}

	public void setPcCintura(int pcCintura) {
		this.pcCintura = pcCintura;
	}

	public int getPcQuadril() {
		return this.pcQuadril;
	}

	public void setPcQuadril(int pcQuadril) {
		this.pcQuadril = pcQuadril;
	}

	public int getPcTorax() {
		return this.pcTorax;
	}

	public void setPcTorax(int pcTorax) {
		this.pcTorax = pcTorax;
	}

	public int getPpAntebracoD() {
		return this.ppAntebracoD;
	}

	public void setPpAntebracoD(int ppAntebracoD) {
		this.ppAntebracoD = ppAntebracoD;
	}

	public int getPpAntebracoE() {
		return this.ppAntebracoE;
	}

	public void setPpAntebracoE(int ppAntebracoE) {
		this.ppAntebracoE = ppAntebracoE;
	}

	public int getPpBracoContraidoD() {
		return this.ppBracoContraidoD;
	}

	public void setPpBracoContraidoD(int ppBracoContraidoD) {
		this.ppBracoContraidoD = ppBracoContraidoD;
	}

	public int getPpBracoContraidoE() {
		return this.ppBracoContraidoE;
	}

	public void setPpBracoContraidoE(int ppBracoContraidoE) {
		this.ppBracoContraidoE = ppBracoContraidoE;
	}

	public int getPpBracoRelaxadoD() {
		return this.ppBracoRelaxadoD;
	}

	public void setPpBracoRelaxadoD(int ppBracoRelaxadoD) {
		this.ppBracoRelaxadoD = ppBracoRelaxadoD;
	}

	public int getPpBracoRelaxadoE() {
		return this.ppBracoRelaxadoE;
	}

	public void setPpBracoRelaxadoE(int ppBracoRelaxadoE) {
		this.ppBracoRelaxadoE = ppBracoRelaxadoE;
	}

	public int getPpCoxaMedialD() {
		return this.ppCoxaMedialD;
	}

	public void setPpCoxaMedialD(int ppCoxaMedialD) {
		this.ppCoxaMedialD = ppCoxaMedialD;
	}

	public int getPpCoxaMedialE() {
		return this.ppCoxaMedialE;
	}

	public void setPpCoxaMedialE(int ppCoxaMedialE) {
		this.ppCoxaMedialE = ppCoxaMedialE;
	}

	public int getPpCoxaProximalD() {
		return this.ppCoxaProximalD;
	}

	public void setPpCoxaProximalD(int ppCoxaProximalD) {
		this.ppCoxaProximalD = ppCoxaProximalD;
	}

	public int getPpCoxaProximalE() {
		return this.ppCoxaProximalE;
	}

	public void setPpCoxaProximalE(int ppCoxaProximalE) {
		this.ppCoxaProximalE = ppCoxaProximalE;
	}

	public int getPpPanturrilhaD() {
		return this.ppPanturrilhaD;
	}

	public void setPpPanturrilhaD(int ppPanturrilhaD) {
		this.ppPanturrilhaD = ppPanturrilhaD;
	}

	public int getPpPanturrilhaE() {
		return this.ppPanturrilhaE;
	}

	public void setPpPanturrilhaE(int ppPanturrilhaE) {
		this.ppPanturrilhaE = ppPanturrilhaE;
	}

	public ComposicaoCorporal getComposicaoCorporalBean() {
		return this.composicaoCorporalBean;
	}

	public void setComposicaoCorporalBean(ComposicaoCorporal composicaoCorporalBean) {
		this.composicaoCorporalBean = composicaoCorporalBean;
	}

}