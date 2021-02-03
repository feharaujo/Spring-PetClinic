package com.fetrova.springpetclinic.data.services;

import com.fetrova.springpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
