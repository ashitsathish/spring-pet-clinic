package com.ashitsathish.petclinicdata.model;

import lombok.Data;

/**
 * Created by ashitsathish on Jul,2020
 */
@Data
public class Person  extends BaseEntity{
    private String firstName;
    private String lastName;
}
