package br.com.springboot.inicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

//O Spring Boot funciona através de configurações feitas previamente que facilitam a construção do projeto, o deixando mais ágil e de melhor entendimento
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.springboot.inicio.repository", "br.com.springboot.inicio.service", "com.bibliotecaAlternativa"}) //escaneia todos os pacotes indicados em busca de classes "@Bean" ou outras configurações determinadas pelo programador
@RestController					//Obs.: não é necessário, na maioria dos casos, utilizar o "@ComponentScan", somente em usos específicos
public class Vendas {

	@Autowired //Indica para o Spring Boot que este é um ponto de injeção, ou seja, utilizará o "@Bean" usado para dizer que o Spring irá gerenciar as instâncias
	@Qualifier("applicationName") //injeta a String "applicationName" na variável applicationName
	private String applicationName;

	@Autowired
	@Qualifier("outraConfiguracao") //injeta a String "applicationName" na variável applicationName
	private String outraConfiguracao;

	@GetMapping("/app") //mapeia o endpoint "/app", e, quando o browser verificar esta URL, mostrará a mensagem que o "return", mostrada na tela do web browser (http://localhost:8080/app)
	public String helloWorld(){
		return applicationName;

	}

	@GetMapping("/config") //mapeia o endpoint "/config", e, quando o browser verificar esta URL, mostrará a mensagem que o "return", mostrada na tela do web browser (http://localhost:8080/config)
	public String outraConfiguracao(){
		return outraConfiguracao;

	}
	public static void main(String[] args) {
		SpringApplication.run(Vendas.class, args);
	}

}
