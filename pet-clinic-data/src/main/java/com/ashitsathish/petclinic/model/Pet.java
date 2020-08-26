package com.ashitsathish.petclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
public class Pet extends BaseEntity {
    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
