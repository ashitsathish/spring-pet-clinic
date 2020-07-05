package com.ashitsathish.petclinicdata.services;

import com.ashitsathish.petclinicdata.model.Pet;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
