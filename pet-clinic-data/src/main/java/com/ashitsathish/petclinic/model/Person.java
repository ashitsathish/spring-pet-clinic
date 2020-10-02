package com.ashitsathish.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by ashitsathish on Jul,2020
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person  extends BaseEntity{


    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
