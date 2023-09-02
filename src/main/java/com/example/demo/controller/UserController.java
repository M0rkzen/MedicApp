package com.example.demo.controller;


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
        if("Medic".equals(userType) || "Patient".equals(userType)) {
            userService.addNewUser(user, userType);
            return new ResponseEntity<>("User created!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Invalid user type.", HttpStatus.BAD_REQUEST);
        }
    }

}
