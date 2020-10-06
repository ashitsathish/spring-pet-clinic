package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}