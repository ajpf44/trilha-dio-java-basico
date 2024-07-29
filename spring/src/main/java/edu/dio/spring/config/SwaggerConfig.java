package edu.dio.spring.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI myOpenAPI() {
		Server server = new Server();
		
		server.setDescription("Server URL - ambiente de desenvolvimento");
		server.setUrl("/");

		Contact contact = new Contact();
		contact.setEmail("a");
		contact.setName("Alexandre Ferreira");
		contact.setUrl("https://github.com/ajpf44");

		Info info = new Info().title("Documentação API - Info 4 -Influence Connect").version("1.0.0").contact(contact)
				.description("API com endpoints do backend do projeto Influence Connect.")
				.termsOfService("https://github.com/InfluenceConnect/back/blob/main/LICENSE");

		return new OpenAPI().info(info).servers(List.of(server));
	}
}
