package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("MEDIC")
@Table(name = "medics")
public class Medic extends User {

    private String specializare;

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public Medic(Long id, String firstName, String lastName, String email, String phone, String birthDate, String specializare) {
        super(id, firstName, lastName, email, phone, birthDate);
        this.specializare = specializare;
    }

    public Medic() {
    }
}
