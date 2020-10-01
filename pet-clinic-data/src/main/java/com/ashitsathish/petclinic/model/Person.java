package com.ashitsathish.petclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
@MappedSuperclass
public class Person  extends BaseEntity{
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
