package br.com.LeonardoMatheus.config;

import javax.persistence.Embeddable;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.support.DomainClassConverter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/inicio-administrador").setViewName("/layout/professor/index");	
		registry.addViewController("/academia/inicio").setViewName("/layout/atleta/index");
		registry.addRedirectViewController("/", "/academia/inicio");
		registry.addRedirectViewController("/admin", "/inicio-administrador");
	}


@SuppressWarnings("deprecation")
@Bean
public EmbeddedServletContainerCustomizer containerCustomizer() {
	return (container ->
	container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404"),
							new ErrorPage(HttpStatus.FORBIDDEN, "/403"),
							new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500")));
	}

@Bean
public DomainClassConverter<FormattingConversionService> domainClassConverter(
		FormattingConversionService conversionService) {
	return new DomainClassConverter<FormattingConversionService>(conversionService);
}

}
