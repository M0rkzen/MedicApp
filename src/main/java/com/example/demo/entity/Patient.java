package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("PATIENT")
@Table(name = "patients")
public class Patient extends User {

    private String disease;
    private String recidivat;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getRecidivat() {
        return recidivat;
    }

    public void setRecidivat(String recidivat) {
        this.recidivat = recidivat;
    }

    public Patient(Long id, String firstName, String lastName, String email, String phone, String birthDate, String disease, String recidivat) {
        super(id, firstName, lastName, email, phone, birthDate);
        this.disease = disease;
        this.recidivat = recidivat;
    }

    public Patient() {
    }
}
