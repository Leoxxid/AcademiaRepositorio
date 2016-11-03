package br.com.LeonardoMatheus.professor.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.LeonardoMatheus.professor.model.AtletaModel;
import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.repository.Atletas;
import br.com.LeonardoMatheus.professor.repository.Dia;

@Service
public class DiaExercicioService {
	@Autowired
	Atletas atleta;

	@Autowired
	public Dia dia;
	
	public List <DiaModel> diaModel; 

	public AtletaModel findAtletaById(Long idAtleta) {

		AtletaModel atletaModel = this.atleta.selectNomeAndMatricula(idAtleta);
		return atletaModel;
	}

	public List<DiaModel> findDiaAtleta(Long idAtleta){
		diaModel = this.dia.diasdoAtleta(idAtleta);
		return diaModel;
		
	}

}
