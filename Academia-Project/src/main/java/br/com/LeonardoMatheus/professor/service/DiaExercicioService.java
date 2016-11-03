package br.com.LeonardoMatheus.professor.service;



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

	public AtletaModel findAtletaById(Long idAtleta) {

		AtletaModel atletaModel = this.atleta.selectNomeAndMatricula(idAtleta);
		return atletaModel;
	}

	public DiaModel findDiaAtleta(Long idAtleta){
		DiaModel diaModel = this.dia.findByAtleta(idAtleta);
		return diaModel;
		
	}

}
