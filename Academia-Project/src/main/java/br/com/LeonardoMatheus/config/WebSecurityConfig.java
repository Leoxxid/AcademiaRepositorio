package br.com.LeonardoMatheus.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Order(1)
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
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
						.antMatchers("/exercicio/editar-exercicio/","/404", "403", "/500").permitAll()
						.antMatchers(/*ATLETA*/"/atleta/todos", "atleta/novo", "atleta/perfil-do-atleta"
								,
								"/atleta/deletar-atleta",
								/*EXERCICIO*/ "/exercicio/novo", "/exercicio/deletar-exercicio", 
								  
								/*TREINO*/ "atletas/treino/treino-do-atleta", "atletas/frequencia-academia",
								"atletas/delete-dia-treino",
								/*INDEX*/ "/inicio"
								)
						.hasRole("PROFESSOR")						
						.antMatchers("/atleta/index")
						.hasRole("ATLETA")
							.anyRequest().authenticated()
						.and()
				.formLogin()
						.loginPage("/login-admin").permitAll()
						.and()
				.logout()
				.permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")
						
						);
						
		
	}
}
