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
			.withUser("joao").password("joao").roles("CADASTRAR_ATLETA")
			.and()
			.withUser("maria").password("maria").roles("C");
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
						.antMatchers("/atleta/novo","/atleta/todos","/exercicio/novo","/inicio", 
										"/treino/atletas/treino-do-atleta",	"/atleta/deletar-atleta/{idAtleta}", 
										"/treino/atletas/cadastraDia", "/avaliacao/atletas/avaliaAtleta", 
										"/atleta/atleta/estatisticas", "/atleta/atleta/treino", "atleta/perfil-do-atleta").permitAll()
						.antMatchers().hasRole("ADMIN")
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
