package br.com.LeonardoMatheus.todos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ErrorPages {

	@RequestMapping("/404")
	public String notFound() {
		return "/error/404";
	}

	@RequestMapping("/403")
	public String forbidden() {
		return "/error/403";
	}
	
	@RequestMapping("/500")
	public String serverError() {
		return "/error/403";
	}

	

}
