package br.com.LeonardoMatheus.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
			.antMatchers("/layout/**");
}
	

@Order(2)	
@Configuration
public static class WebSecurotyConfigAdmin extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("maria").password("maria").roles("PROFESSOR");
	}
	
		@Override
		protected void configure(HttpSecurity http) throws Exception{
			
			
			http
					.authorizeRequests()
							.antMatchers("/404", "403", "/500").permitAll()
							.antMatchers(/*ATLETA*/"/atleta/todos", "atleta/novo", "atleta/perfil-do-atleta",
									"/atleta/deletar-atleta",
									/*EXERCICIO*/ "/exercicio/novo", "exercicio/deletar-exercicio", 
									"exercicio/editar-exercicio",  "exercicio/teste", "editar-exercicio/erro",
									/*TREINO*/ "atletas/treino/treino-do-atleta", "atletas/frequencia-academia",
									"atletas/delete-dia-treino",
									/*INDEX*/ "/inicio-administrador"
									)
							.hasRole("PROFESSOR")						
								.anyRequest().authenticated()
					.and()
							.csrf()
							
					.and()
					.formLogin()
							.loginPage("/login-admin").permitAll()
							.defaultSuccessUrl("/inicio-administrador")
							.and()
					.logout()
					.permitAll()
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout")
					
							);

		
	}
	
}

@Order(1)
@Configuration
public static class WebSecurityConfigUser extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("maria123").password("maria123").roles("ATLETA");
			}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{	
		
	http
	.antMatcher("/academia/**")
	.authorizeRequests()
			
			.antMatchers("/404", "403", "/500").permitAll()
			.antMatchers( "academia/**"
					)
			.hasRole("ATLETA")						
				.anyRequest().authenticated()
			.and()
	.formLogin()
			.loginPage("/academia/login")
			.failureUrl("/academia/login?error")
            .defaultSuccessUrl("/academia/inicio").permitAll()
			.and()
	.logout()
		.logoutUrl("/academia/logout")
		.logoutSuccessUrl("/academia/login?logout")
	.permitAll()
	.logoutRequestMatcher(new AntPathRequestMatcher("/logout")
			
			);


}	
	
}

}
