package com.fetrova.springpetclinic.data.services;

import com.fetrova.springpetclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
