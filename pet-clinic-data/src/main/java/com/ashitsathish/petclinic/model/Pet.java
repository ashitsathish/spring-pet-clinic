package com.ashitsathish.petclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "pettype_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner_id" )
    private Owner owner;
    @Column(name = "birth_date" )
    private LocalDate birthDate;
}
