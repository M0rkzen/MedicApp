package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findUserByFirstName(String firstName);

    List<User> findUserByLastName(String lastName);

    List<User> findUserByFirstNameOrEmail(String firstName, String email);

    List<User> findUserByFirstNameAndEmail(String firstName, String email);

    List<User> findUserByType(String type);
}
