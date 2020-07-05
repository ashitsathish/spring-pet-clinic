package com.ashitsathish.petclinicdata.services;

import com.ashitsathish.petclinicdata.model.Owner;

/**
 * Created by ashitsathish on Jul,2020
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
