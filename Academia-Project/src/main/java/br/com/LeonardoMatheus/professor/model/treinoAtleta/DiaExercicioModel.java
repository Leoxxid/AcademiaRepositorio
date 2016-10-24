package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIA_X_EXERCICIO")
public class DiaExercicioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIA_X_EXERCICIo")
	private Long idDiaExercicio;


	// ===== GETTERS AND SETTERS

	public Long getIdDiaExercicio() {
		return idDiaExercicio;
	}

	public void setIdDiaExercicio(Long idDiaExercicio) {
		this.idDiaExercicio = idDiaExercicio;
	}


}
