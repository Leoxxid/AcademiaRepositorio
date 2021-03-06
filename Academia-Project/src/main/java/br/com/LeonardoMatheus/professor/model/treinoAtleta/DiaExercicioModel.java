package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javassist.expr.NewArray;

@Entity
@Table(name = "DIA_X_EXERCICIO")
public class DiaExercicioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIA_X_EXERCICIo")
	private Long idDiaExercicio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "DIA_TREINO")
	private DiaModel dia = new DiaModel();

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "EXERCICIO")
	private ExercicioModel exercicio = new ExercicioModel();

	// ===== GETTERS AND SETTERS

	public ExercicioModel getExercicio() {
		return exercicio;
	}

	public void setExercicio(ExercicioModel exercicio) {
		this.exercicio = exercicio;
	}

	public DiaModel getDia() {
		return dia;
	}

	public void setDia(DiaModel dia) {
		this.dia = dia;
	}

	public Long getIdDiaExercicio() {
		return idDiaExercicio;
	}

	public void setIdDiaExercicio(Long idDiaExercicio) {
		this.idDiaExercicio = idDiaExercicio;
	}

}
