package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@DiscriminatorValue("Patient")

public class Patient extends User{

    private String disease;

    public Patient(Long id, String firstName, String lastName, String email, String phone, Date birthDate, String userType, String disease) {
        super(id, firstName, lastName, email, phone, birthDate, userType);
        this.disease = disease;
    }

    public Patient() {
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
