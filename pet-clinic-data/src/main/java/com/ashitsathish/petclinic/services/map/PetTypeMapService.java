package com.ashitsathish.petclinic.services.map;

import com.ashitsathish.petclinic.model.PetType;
import com.ashitsathish.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ashitsathish on Aug,2020
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements
        PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
