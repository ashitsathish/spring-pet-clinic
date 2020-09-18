package com.ashitsathish.petclinic.bootstrap;

import com.ashitsathish.petclinic.model.*;
import com.ashitsathish.petclinic.services.OwnerService;
import com.ashitsathish.petclinic.services.PetTypeService;
import com.ashitsathish.petclinic.services.SpecialityService;
import com.ashitsathish.petclinic.services.VetService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by ashitsathish on Jul,2020
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialitiesService;

    @Override
    public void run(String... args) throws Exception {
      if(petTypeService.findAll().size()==0){  // loading data when there is no data in pet type service.
          loadData();
      }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        petTypeService.save(cat);

        val radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialitiesService.save(radiology);

        val surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialitiesService.save(surgery);

        val dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialitiesService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("11290 arbor creek drive");
        owner1.setCity("Richmond");
        owner1.setTelephone("3125222740");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(dog);
        mikesPet.setOwner(owner1);
        mikesPet.setName("Rosco");
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("duncan part court");
        owner2.setCity("Glen Allen");
        owner2.setTelephone("3195222740");

        Pet fionasCat = new Pet();
        mikesPet.setPetType(cat);
        mikesPet.setOwner(owner2);
        mikesPet.setName("Just cat");
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        val vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        val vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
