package com.example.demo.repository;

import com.example.demo.entity.Medic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicRepository extends JpaRepository<Medic, Long> {

    List<Medic> findMedic(String type);
    List<Medic> findSpecialMedic(String specialization);
}
