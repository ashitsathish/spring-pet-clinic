package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
