package com.example.Spring_Day1.Services;

import com.example.Spring_Day1.Models.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServices {
    List<Students> st = new ArrayList<>(
            Arrays.asList(new Students(1, "kamalesh", "JAVA Developer"), new Students(2, "Yugesh", "VLSI"))
    );


    public List<Students> getMethod(){
        return st;
    }

    public String postMethod() {
        return "this is post method!";
    }

    public String putMethod() {
        return "this is put method!";
    }
    public String deleteMethod() {
        return "this is delete method!";
    }
}
