package com.example.demo.controller;


import com.example.demo.entity.Medic;
import com.example.demo.entity.User;
import com.example.demo.service.MedicService;
import com.example.demo.service.PatientService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        String userType = user.getUserType();

        if (userType == null || (!userType.equals("Medic") && !userType.equals("Patient"))) {
            return new ResponseEntity<>("Invalid user type!", HttpStatus.BAD_REQUEST);
        }

        userService.addNewUser(user, userType);

        if (userType.equals("Medic")) {
            if (user instanceof Medic) {
                Medic medic = (Medic) user;
                String specializare = medic.getSpecializare();
                medicService.specializare(medic, specializare);
                return new ResponseEntity<>("Medic created with specialization: " + specializare, HttpStatus.CREATED);
            }
        } else if (userType.equals("Patient")) {
            return new ResponseEntity<>("Patient created!", HttpStatus.CREATED);
        }

        return new ResponseEntity<>("User created!", HttpStatus.CREATED);
    }
}
