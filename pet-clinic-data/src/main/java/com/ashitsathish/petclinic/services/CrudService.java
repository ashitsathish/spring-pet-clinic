package com.ashitsathish.petclinic.services;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save (T object);
    void delete(T object);
    void deleteById(ID id);
}
