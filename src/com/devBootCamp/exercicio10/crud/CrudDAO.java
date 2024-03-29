package com.devBootCamp.exercicio10.crud;

import java.util.List;

public interface CrudDAO<T extends BaseObject> {

    T save(T entity);

    void delete(Integer id);

    List<T> findAll();

    T findById(Integer id);

}
