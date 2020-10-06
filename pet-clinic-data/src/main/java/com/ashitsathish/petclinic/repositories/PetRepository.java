package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
