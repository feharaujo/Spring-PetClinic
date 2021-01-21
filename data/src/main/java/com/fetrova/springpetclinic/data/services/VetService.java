package com.fetrova.springpetclinic.data.services;


import com.fetrova.springpetclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
