package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@DiscriminatorValue("Medic")

public class Medic  extends User{

    private String specializare;

    public Medic(Long id, String firstName, String lastName, String email, String phone, Date birthDate, String userType, String specializare) {
        super(id, firstName, lastName, email, phone, birthDate, userType);
        this.specializare = specializare;
    }

    public Medic() {
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
