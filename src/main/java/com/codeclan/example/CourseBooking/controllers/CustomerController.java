package com.codeclan.example.CourseBooking.controllers;

import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


//    @GetMapping(value = "/findAllByCourseName")
//    public List<Customer> findAllByCourseName(@RequestParam String courseName){
//        return customerRepository.findAllByCourseName(courseName);
//    }
}
