package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "EXERCICIO")
public class ExercicioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXERCICIO")
	private Long idExercicio;

	@NotBlank(message="O nome não pode estar vazio")
	@Size(min = 5, max = 25, message = "Deve conter de 5 a 25 caracteres!")
	@Column(name = "NOME_EXERCICIO")
	private String nomeExercicio;

	@NotBlank(message="A categoria não pode estar vazia")
	@Size(min=3, max = 30, message = "Deve conter de 5 e 30 caracteres!")
	@Column(name = "CATEGORIA")
	private String categoria;

	@Size(max = 500, message = "A descrição do exercício não pode exceder 500 caracteres!")
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
