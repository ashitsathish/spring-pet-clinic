package com.ashitsathish.petclinic.services.map;

import com.ashitsathish.petclinic.model.Speciality;
import com.ashitsathish.petclinic.model.Vet;
import com.ashitsathish.petclinic.services.SpecialityService;
import com.ashitsathish.petclinic.services.VetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ashitsathish on Jul,2020
 */
@Service
@RequiredArgsConstructor
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialityService specialityService;
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() ==null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
