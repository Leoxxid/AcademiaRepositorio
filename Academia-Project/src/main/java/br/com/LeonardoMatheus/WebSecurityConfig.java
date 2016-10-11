package br.com.LeonardoMatheus;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("joao").password("joao").roles("CADASTRAR_ATLETA");
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
						.antMatchers("/atleta/novo").hasRole("CADASTRAR_ATLETA")
						.anyRequest().authenticated()
						.and()
				.formLogin()
						.loginPage("/login").permitAll()
						.and()
				.logout()
						.permitAll();
	}
}
