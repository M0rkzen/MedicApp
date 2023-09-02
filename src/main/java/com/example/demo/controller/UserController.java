package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.MedicService;
import com.example.demo.service.PatientService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    private MedicService medicService;
    private PatientService patientService;

    @Autowired

    public UserController(UserService userService, MedicService medicService, PatientService patientService) {
        this.userService = userService;
        this.medicService = medicService;
        this.patientService = patientService;
    }

    @PostMapping()
    public ResponseEntity<Object> addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
        return new ResponseEntity<>("User created.", HttpStatus.CREATED);
    }
}
