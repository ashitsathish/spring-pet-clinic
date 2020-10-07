package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
   Owner findByLastName(String name);
}
