package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the exercicio database table.
 * 
 */
@Entity
@NamedQuery(name="Exercicio.findAll", query="SELECT e FROM Exercicio e")
public class Exercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_EXERCICIO")
	private int idExercicio;

	private String categoria;

	private String descricao;

	@Column(name="NOME_EXERCICIO")
	private String nomeExercicio;

	//bi-directional many-to-one association to DiaXExercicio
	@OneToMany(mappedBy="exercicioBean")
	private List<DiaXExercicio> diaXExercicios;

	public Exercicio() {
	}

	public int getIdExercicio() {
		return this.idExercicio;
	}

	public void setIdExercicio(int idExercicio) {
		this.idExercicio = idExercicio;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeExercicio() {
		return this.nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public List<DiaXExercicio> getDiaXExercicios() {
		return this.diaXExercicios;
	}

	public void setDiaXExercicios(List<DiaXExercicio> diaXExercicios) {
		this.diaXExercicios = diaXExercicios;
	}

	public DiaXExercicio addDiaXExercicio(DiaXExercicio diaXExercicio) {
		getDiaXExercicios().add(diaXExercicio);
		diaXExercicio.setExercicioBean(this);

		return diaXExercicio;
	}

	public DiaXExercicio removeDiaXExercicio(DiaXExercicio diaXExercicio) {
		getDiaXExercicios().remove(diaXExercicio);
		diaXExercicio.setExercicioBean(null);

		return diaXExercicio;
	}

}