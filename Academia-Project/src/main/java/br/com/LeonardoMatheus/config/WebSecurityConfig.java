package br.com.LeonardoMatheus.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("joao").password("joao").roles("ATLETA")
			.and()
			.withUser("maria").password("maria").roles("PROFESSOR");
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
			.antMatchers("/layout/**");
}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		
		http
				.authorizeRequests()
						.antMatchers("/atleta/novo","/exercicio/novo","/inicio", 
											"/atletas/treino/treino-do-atleta/", "/atleta/deletar-atleta/{idAtleta}", 
											"/atletas/frequencia-academia/", "/avaliacao/atletas/avaliaAtleta", 
											"/atleta/atleta/estatisticas", "atleta/perfil-do-atleta",
											"/atletas/treino/treino-do-atleta/", "/visualizar/treino", "/404", "403", "/500").permitAll()
						.antMatchers("/atleta/todos").hasRole("PROFESSOR")
							.anyRequest().authenticated()
						
						.antMatchers("/atleta/index").hasRole("ATLETA")
							.anyRequest().authenticated()
						.and()
				.formLogin()
						.loginPage("/login").permitAll()
						.and()
				.logout()
				.permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
						
		
	}
}
