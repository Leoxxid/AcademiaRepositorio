package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dia_treino database table.
 * 
 */
@Entity
@Table(name="dia_treino")
@NamedQuery(name="DiaTreino.findAll", query="SELECT d FROM DiaTreino d")
public class DiaTreino implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIA")
	private int idDia;

	@Column(name="DIA_SEMANA")
	private String diaSemana;

	//bi-directional many-to-one association to CadastroAluno
	@ManyToOne
	@JoinColumn(name="ALUNO")
	private CadastroAluno cadastroAluno;

	//bi-directional many-to-one association to DiaXExercicio
	@OneToMany(mappedBy="diaTreinoBean")
	private List<DiaXExercicio> diaXExercicios;

	public DiaTreino() {
	}

	public int getIdDia() {
		return this.idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	public String getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public CadastroAluno getCadastroAluno() {
		return this.cadastroAluno;
	}

	public void setCadastroAluno(CadastroAluno cadastroAluno) {
		this.cadastroAluno = cadastroAluno;
	}

	public List<DiaXExercicio> getDiaXExercicios() {
		return this.diaXExercicios;
	}

	public void setDiaXExercicios(List<DiaXExercicio> diaXExercicios) {
		this.diaXExercicios = diaXExercicios;
	}

	public DiaXExercicio addDiaXExercicio(DiaXExercicio diaXExercicio) {
		getDiaXExercicios().add(diaXExercicio);
		diaXExercicio.setDiaTreinoBean(this);

		return diaXExercicio;
	}

	public DiaXExercicio removeDiaXExercicio(DiaXExercicio diaXExercicio) {
		getDiaXExercicios().remove(diaXExercicio);
		diaXExercicio.setDiaTreinoBean(null);

		return diaXExercicio;
	}

}