package com.ashitsathish.petclinicdata.services;

import com.ashitsathish.petclinicdata.model.Owner;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner>  findAll();
}
