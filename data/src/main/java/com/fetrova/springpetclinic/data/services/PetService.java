package com.fetrova.springpetclinic.data.services;


import com.fetrova.springpetclinic.data.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();


}
