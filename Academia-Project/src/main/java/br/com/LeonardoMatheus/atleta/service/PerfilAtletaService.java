package br.com.LeonardoMatheus.atleta.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class PerfilAtletaService {

	public String usuarioLogado() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
			 username = ((UserDetails) principal).getUsername();
			
		}else {
			 username = principal.toString();
		}
		return username;
	}

}
