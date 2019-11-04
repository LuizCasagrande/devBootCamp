package com.devBootCamp.exercicio10.cliente;

import com.devBootCamp.exercicio10.crud.CrudService;

public interface ClienteService extends CrudService<Cliente> {

    void atualizarEndereco(String rua, String numero);

}
