package br.com.LeonardoMatheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.LeonardoMatheus")
public class AcademiaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademiaProjectApplication.class, args);
	}
}
