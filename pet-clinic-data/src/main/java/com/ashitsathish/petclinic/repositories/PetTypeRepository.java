package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
