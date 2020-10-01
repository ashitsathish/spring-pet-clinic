package com.ashitsathish.petclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    @Column(name = "name")
    private String name;
}
