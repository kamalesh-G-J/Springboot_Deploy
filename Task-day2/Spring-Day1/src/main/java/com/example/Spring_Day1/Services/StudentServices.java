package com.example.Spring_Day1.Services;

import com.example.Spring_Day1.Models.StudentParentDetails;
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

    List<StudentParentDetails> stdp = new ArrayList<>(
            Arrays.asList(new StudentParentDetails("Jayaram","Geetha"))
    );
    public List<StudentParentDetails> getStudentparentdetails() {
        return stdp;
    }
}
