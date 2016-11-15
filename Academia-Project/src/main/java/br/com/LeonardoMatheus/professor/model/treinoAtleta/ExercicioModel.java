package br.com.LeonardoMatheus.professor.model.treinoAtleta;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@Size(min = 5, max = 50, message = "Deve conter de 5 a 50 caracteres!")
	@Column(name = "NOME_EXERCICIO")
	private String nomeExercicio;

	@NotBlank(message="A categoria não pode estar vazia")
	@Size(min=3, max = 30, message = "Deve conter de 3 e 30 caracteres!")
	@Column(name = "CATEGORIA")
	private String categoria;

	@Size(max = 1000, message = "A descrição do exercício não pode exceder 1000 caracteres!")
	@Column(name = "DESCRICAO")
	private String descricao;

	@OneToMany(fetch=FetchType.LAZY, mappedBy = "exercicio")
	private List<DiaExercicioModel> exercicio;
	
	//Construtor 
	public ExercicioModel(Long idExercicio, String nomeExercicio){
		this.idExercicio = idExercicio;
		this.nomeExercicio = nomeExercicio;
	}
	public ExercicioModel(){
		
	}

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
	public List<DiaExercicioModel> getExercicio() {
		return exercicio;
	}
	

}
