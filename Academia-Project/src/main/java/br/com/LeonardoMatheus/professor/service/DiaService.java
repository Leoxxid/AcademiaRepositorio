package br.com.LeonardoMatheus.professor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.LeonardoMatheus.professor.model.treinoAtleta.DiaModel;
import br.com.LeonardoMatheus.professor.repository.Dia;


@Service
public class DiaService {

	@Autowired
	public Dia dia;

	public List<DiaModel> findDia(Long idAtleta) {
		List<DiaModel> diaModel = this.dia.findByAtletaIdAluno(idAtleta);
		return diaModel;
	}

	public List<String> diasPossiveis() {
		List<String> dias = new ArrayList<>();
		dias.add("SEG");
		dias.add("TER");
		dias.add("QUA");
		dias.add("QUI");
		dias.add("SEX");
		dias.add("SAB");

		return dias;
	}


	public List<String> diasQueNaoVai(List<DiaModel> diasModel) {
		
		
		// recebendo os dias em que a academia fica aberta
		List<String> diasPossiveis = new ArrayList<>();
		diasPossiveis = diasPossiveis();

		// percorrendo os dias que o aluno vai a academia
		for (DiaModel diaModel : diasModel) {
			// percorrendo os dias abertos
			for (int i = 0 ; i < diasPossiveis.size(); i++) {
				if (diaModel.getDiaSemana().equals(diasPossiveis.get(i))) {
					diasPossiveis.remove(i);
				}

			}
		}
		return diasPossiveis;
	}

}
