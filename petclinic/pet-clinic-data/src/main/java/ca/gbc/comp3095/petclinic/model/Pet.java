package ca.gbc.comp3095.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType pet_type;
    private Owner pet_owner;
    private LocalDate birth_date;

}
