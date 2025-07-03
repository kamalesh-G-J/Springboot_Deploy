package com.example.Spring_Day1.Models;

import lombok.Data;

@Data
public class StudentParentDetails {
    private String studentfathername;
    private String studentmothername;

    public StudentParentDetails(String studentfathername, String studentmothername) {
        this.studentfathername = studentfathername;
        this.studentmothername = studentmothername;
    }
}
