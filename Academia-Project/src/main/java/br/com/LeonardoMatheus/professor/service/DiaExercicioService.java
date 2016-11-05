package br.com.LeonardoMatheus.professor.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaExercicioModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.repository.Dia;
import br.com.LeonardoMatheus.professor.repository.DiaExercicio;

@Service
public class DiaExercicioService {
	@Autowired
	Atletas atleta;

	@Autowired
	public Dia dia;
	
	@Autowired
	public DiaExercicio diaExercicio;
	
	public List <DiaModel> diaModel; 
	
	public void saveDiaExercicio(DiaExercicioModel diaExercicioModel){
		this.diaExercicio.save(diaExercicioModel);
		
	}

	public AtletaModel selectAtletaAndId(Long idAtleta) {

		AtletaModel atletaModel = this.atleta.selectNomeAndMatricula(idAtleta);
		return atletaModel;
	}

	public List<DiaModel> findDiaAtleta(Long idAtleta){
		diaModel = this.dia.diasdoAtleta(idAtleta);
		return diaModel;
		
	}
	
	public List <DiaExercicioModel> diaExercicioDoAtleta(List <DiaModel> diaModel){
		
		List<DiaExercicioModel> diaExercicioModel = new ArrayList<>();
		for (DiaModel diaModelFE : this.diaModel) {
			diaExercicioModel.addAll(this.diaExercicio.findByDiaIdDia(diaModelFE.getIdDia()));
		}
		return diaExercicioModel;
	}

}
