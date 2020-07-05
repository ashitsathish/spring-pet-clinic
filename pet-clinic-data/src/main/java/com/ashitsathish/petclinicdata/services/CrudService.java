package com.ashitsathish.petclinicdata.services;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save (T object);
    void delete(T oject);
    void deleteById(ID id);
}
