package br.com.springboot.inicio.repository;

import org.springframework.stereotype.Repository;

import br.com.springboot.inicio.model.Cliente;

//
@Repository //Indica que esta classe irá acessar a base de dados diretamente. Faz diversas operações, como salvar, atualizar, deletar, etc...
public class ClientesRepository {

    public static void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
    }
    
}
