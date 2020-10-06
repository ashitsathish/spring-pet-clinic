package com.ashitsathish.petclinic.repositories;

import com.ashitsathish.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashitsathish on Oct,2020
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
