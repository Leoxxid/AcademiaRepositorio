package br.com.LeonardoMatheus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dia_x_exercicio database table.
 * 
 */
@Entity
@Table(name="dia_x_exercicio")
@NamedQuery(name="DiaXExercicio.findAll", query="SELECT d FROM DiaXExercicio d")
public class DiaXExercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIA_X_EXERCICIO")
	private int idDiaXExercicio;

	//bi-directional many-to-one association to Exercicio
	@ManyToOne
	@JoinColumn(name="EXERCICIO")
	private Exercicio exercicioBean;

	//bi-directional many-to-one association to DiaTreino
	@ManyToOne
	@JoinColumn(name="DIA_TREINO")
	private DiaTreino diaTreinoBean;

	public DiaXExercicio() {
	}

	public int getIdDiaXExercicio() {
		return this.idDiaXExercicio;
	}

	public void setIdDiaXExercicio(int idDiaXExercicio) {
		this.idDiaXExercicio = idDiaXExercicio;
	}

	public Exercicio getExercicioBean() {
		return this.exercicioBean;
	}

	public void setExercicioBean(Exercicio exercicioBean) {
		this.exercicioBean = exercicioBean;
	}

	public DiaTreino getDiaTreinoBean() {
		return this.diaTreinoBean;
	}

	public void setDiaTreinoBean(DiaTreino diaTreinoBean) {
		this.diaTreinoBean = diaTreinoBean;
	}

}