package com.ashitsathish.petclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by ashitsathish on Aug,2020
 */
@Data
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Pet pet;
}
