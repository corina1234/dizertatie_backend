package com.master.backend.controllers;

import com.master.backend.entities.Employee;
import com.master.backend.projection.BookingGeneral;
import com.master.backend.repositories.EmployeeRepository;
import com.master.backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestController
@RequestMapping("/login")
public class UserController {
    private EmployeeRepository employeeRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(EmployeeRepository employeeRepository, PasswordEncoder passwordEncoder) {

        this.employeeRepository = employeeRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/check")
    public ResponseEntity<?> getMeetingRooms(@RequestParam("username") String username, @RequestParam("password") String password) {
        Employee employee = employeeRepository.findByEmail(username);
        boolean result = false;
        if(employee != null){
            result = passwordEncoder.matches(password, employee.getPassword());
        }
        return ResponseEntity.ok(result);
    }
}
