package com.example.Spring_Day1.Controller;


import com.example.Spring_Day1.Models.Students;
import com.example.Spring_Day1.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student {

    @Autowired
    private StudentServices hws;

    @GetMapping("/")
    public List<Students> getMethod() {
        return hws.getMethod();
    }
   
}