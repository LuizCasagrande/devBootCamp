package com.devBootCamp.exercicio10.vendedor;

import com.devBootCamp.exercicio10.crud.CrudServiceImpl;

public class VendedorServiceImpl extends CrudServiceImpl<Vendedor> implements VendedorService {

    @Override
    protected void preSave(Vendedor entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Nome Invalido");
        }
    }

}
