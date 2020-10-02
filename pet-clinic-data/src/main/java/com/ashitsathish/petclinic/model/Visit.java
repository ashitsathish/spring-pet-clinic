package com.ashitsathish.petclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by ashitsathish on Aug,2020
 */
@Data
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
