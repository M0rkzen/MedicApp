package com.example.demo.entity;


import jakarta.persistence.Entity;

@Entity
public class Patient extends User {
    private String disease;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Patient() {
    }

    public Patient(String disease) {
        this.disease = disease;
    }
}
