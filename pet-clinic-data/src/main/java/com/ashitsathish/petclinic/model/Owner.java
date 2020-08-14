package com.ashitsathish.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
@Getter @Setter
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;
}
