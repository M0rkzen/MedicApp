package com.example.demo.entity;


import jakarta.persistence.Entity;

@Entity
public class Medic extends User {
    private String specialization;

    public Medic() {

    }

    public Medic(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
       this.specialization = specialization;
    }


}

