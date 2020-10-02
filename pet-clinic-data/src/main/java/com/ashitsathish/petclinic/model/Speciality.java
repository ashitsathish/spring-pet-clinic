package com.ashitsathish.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ashitsathish on Aug,2020
 */
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;
}
