package com.ashitsathish.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
@Getter @Setter
public class Vet extends Person {
    private Set<Speciality> specialities;
}
