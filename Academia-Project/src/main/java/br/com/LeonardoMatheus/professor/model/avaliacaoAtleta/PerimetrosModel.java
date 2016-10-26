package br.com.LeonardoMatheus.professor.model.avaliacaoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="PERIMETROS")
public class PerimetrosModel {
	
	@Id
	@Column(name="ID_PERIMETROS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerimetros;

	public Long getIdPerimetros() {
		return idPerimetros;
	}

	public void setIdPerimetros(Long idPerimetros) {
		this.idPerimetros = idPerimetros;
	}
}
