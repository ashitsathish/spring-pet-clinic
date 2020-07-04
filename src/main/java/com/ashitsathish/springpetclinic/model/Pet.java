package com.ashitsathish.springpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
