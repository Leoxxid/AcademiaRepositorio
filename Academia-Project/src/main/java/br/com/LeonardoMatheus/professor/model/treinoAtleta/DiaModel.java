package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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



	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ALUNO")
	private AtletaModel atleta;
	
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "dia")
	private List<DiaExercicioModel> dia;
	
	//Construtores
	public DiaModel(Long idDia, String diaSemana){
		this.idDia = idDia; 
		this.diaSemana = diaSemana;
		
	}
	public DiaModel(){
		
	};

	
	
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


	public AtletaModel getAtleta() {
		return atleta;
	}

	public void setAtleta(AtletaModel atleta) {
		this.atleta = atleta;
		
	}
	public List<DiaExercicioModel> getDia() {
		return dia;
	}
	public void setDia(List<DiaExercicioModel> dia) {
		this.dia = dia;
	}
	
	

}
