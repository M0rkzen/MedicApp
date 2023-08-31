package com.example.demo.service;


import com.example.demo.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicService {

    private MedicRepository medicRepository;


    @Autowired
    public MedicService(MedicRepository medicRepository) {
        this.medicRepository = medicRepository;
    }

}
