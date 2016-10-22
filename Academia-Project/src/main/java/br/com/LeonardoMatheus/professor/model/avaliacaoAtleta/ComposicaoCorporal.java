package br.com.LeonardoMatheus.professor.model.avaliacaoAtleta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPOSICAO_CORPORAL")
public class ComposicaoCorporal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_COMPOSICAO_CORPORAL")
	private Long idComposicaoCorporal;

	public Long getIdComposicaoCorporal() {
		return idComposicaoCorporal;
	}

	public void setIdComposicaoCorporal(Long idComposicaoCorporal) {
		this.idComposicaoCorporal = idComposicaoCorporal;
	}
	
	

}
