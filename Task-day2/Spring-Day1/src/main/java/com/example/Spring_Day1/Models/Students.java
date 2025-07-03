package com.example.Spring_Day1.Models;

import lombok.Data;

@Data
public class Students {
    private int stu_id;
    private String firstname;
    private String domain;

    public Students(int stu_id, String firstname, String domain) {
        this.stu_id = stu_id;
        this.firstname = firstname;
        this.domain = domain;
    }
}
