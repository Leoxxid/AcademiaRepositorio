package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.LeonardoMatheus.professor.model.AtletaModel;

@Entity
@Table(name = "DIA_TREINO")
public class DiaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIA")
	private Long idDia;

	@Column(name = "DIA_SEMANA")
	private String diaSemana;
	
	@ManyToOne
	@JoinColumn(name="ALUNO")
	private AtletaModel atleta;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dia")
	private List<DiaExercicioModel> dia;
	
	//Construtor
	public DiaModel(Long idDia, String diaSemana){
		this.idDia = idDia; 
		this.diaSemana = diaSemana;
		
	}
	
	public Long getIdDia() {
		return idDia;
	}

	public void setIdDia(Long idDia) {
		this.idDia = idDia;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public List<DiaExercicioModel> getDia() {
		return dia;
	}

	public void setDia(List<DiaExercicioModel> dia) {
		this.dia = dia;
	}

}
