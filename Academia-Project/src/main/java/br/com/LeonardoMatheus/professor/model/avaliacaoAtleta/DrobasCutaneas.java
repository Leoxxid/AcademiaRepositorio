package br.com.LeonardoMatheus.professor.model.avaliacaoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOBRAS_CUTANEAS")
public class DrobasCutaneas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOBRAS_CUTANEAS")
	private Long idDrobasCutaneas;

}
