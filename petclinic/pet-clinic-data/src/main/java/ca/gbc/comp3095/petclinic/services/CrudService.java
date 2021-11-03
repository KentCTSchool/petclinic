package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {


    Set<T> findAll();
    T findById(ID id);
    T save(T object);

    void delete(T object);
    void deleteById(T object);
}
