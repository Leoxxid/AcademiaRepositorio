package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.LeonardoMatheus.professor.model.AtletaModel;

@Entity
@Table(name="DIA_TREINO")
public class DiaTreinoModel {
	
	@Id
	@Column(name="ID_DIA")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDia;
	
	@Column (name="DIA_SEMANA")
	private String diaSemana;
	
	
	
	
}
