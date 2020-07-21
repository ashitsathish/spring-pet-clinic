package com.ashitsathish.petclinic.services;

import com.ashitsathish.petclinic.model.Owner;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
