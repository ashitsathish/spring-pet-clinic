package com.ashitsathish.petclinic.services.map;

import com.ashitsathish.petclinic.model.Pet;
import com.ashitsathish.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
