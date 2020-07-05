package com.ashitsathish.petclinicdata.services;

import com.ashitsathish.petclinicdata.model.Vet;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
