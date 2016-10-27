package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EXERCICIO")
public class ExercicioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXERCICIO")
	private Long idExercicio;

	@Column(name = "NOME_EXERCICIO")
	private String nomeExercicio;

	@Column(name = "CATEGORIA")
	private String categoria;

	@Column(name = "DESCIRCAO")
	private String descricao;

	@OneToMany(mappedBy = "exercicio")
	private List<DiaExercicioModel> exercicio;

	// ===== GETTERS AND SETTERS

	public void setExercicio(List<DiaExercicioModel> exercicio) {
		this.exercicio = exercicio;
	}

	public Long getIdExercicio() {
		return idExercicio;
	}

	public void setIdExercicio(Long idExercicio) {
		this.idExercicio = idExercicio;
	}

	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
