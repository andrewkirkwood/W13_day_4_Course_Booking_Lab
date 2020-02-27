package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

}
