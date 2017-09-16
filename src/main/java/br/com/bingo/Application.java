package br.com.bingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 * [ATENÇÃO] - E Necessário que essa classe sempre esteja um pacote antes
 * dos pacotes de controller, service e dao.
 * Ex: br.com.bingo (OK) adiciona a classe aqui
 * Ex: br.com.bingo.main (ERRADO) Não irá renderizar sua página JSP
 * @author Herivelton
 *
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
		
}
