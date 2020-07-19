package com.ashitsathish.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ashitsathish.petclinicdata")
public class SpringPetClinicApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPetClinicApplication.class, args);
    }

}
