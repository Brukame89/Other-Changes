package br.com.springboot.inicio.service;

import org.springframework.stereotype.Service;

import br.com.springboot.inicio.model.Cliente;
import br.com.springboot.inicio.repository.ClientesRepository;

//A classe "ClientsServices" precisa do "ClientsRepository" para poder salvar os clientes que ele irá gerenciar, para então poder armazená-los na Base de Dados
@Service //classe que tem as regras de negócio, as validações, gera relatórios, que tem o objeto que acessa a base de dados, etc...
public class ClientesServices {

    
    private ClientesRepository repository;

    
    public ClientesServices(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarClientes (Cliente cliente){
        validarClientes(cliente);
        this.repository.persistir(cliente);
    }
    
    public void validarClientes(Cliente cliente){

    }
}
