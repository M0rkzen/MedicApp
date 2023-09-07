package com.example.demo.repository;

import com.example.demo.entity.Patient;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<User> findPatientByFirstName(String firstName);
}
