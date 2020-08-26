package com.ashitsathish.petclinic.bootstrap;

import com.ashitsathish.petclinic.model.Owner;
import com.ashitsathish.petclinic.model.Pet;
import com.ashitsathish.petclinic.model.PetType;
import com.ashitsathish.petclinic.model.Vet;
import com.ashitsathish.petclinic.services.OwnerService;
import com.ashitsathish.petclinic.services.PetTypeService;
import com.ashitsathish.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by ashitsathish on Jul,2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
      loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        petTypeService.save(cat);

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

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
