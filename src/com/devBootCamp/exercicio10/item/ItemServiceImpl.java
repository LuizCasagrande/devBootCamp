package com.devBootCamp.exercicio10.item;

import com.devBootCamp.exercicio10.crud.CrudServiceImpl;

public class ItemServiceImpl extends CrudServiceImpl<Item> implements ItemService {

    @Override
    protected void preSave(Item entity) {
        if (entity.getQuantidade() == null) {
            throw new RuntimeException("Quantidade deve ser informada");
        }
    }

}
