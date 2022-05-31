package br.com.springboot.inicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //escaneia todas as classes de configuração que existe dentro desta classe e seleciona a classe pretendida
public class MyConfiguration {

    @Bean(name = "applicationName") //Bean é uma classe onde o programador determina que o spring container é quem irá gerenciar as instâncias dessa classe (é um substituto para o "new" para criar uma instância )
                                    
    public String applicationName(){
        return "Sistema de Vendas"; //é a mensagem que aparecerá no browser ou em qualquer outro ambiente que utilizar a String "applicationName"
    }
    
    @Bean(name = "outraConfiguracao")
    public String outraConfiguracao(){
        return "Configurações de Compras"; 
    }
}
