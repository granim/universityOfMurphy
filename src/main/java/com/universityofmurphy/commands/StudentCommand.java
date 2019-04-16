package com.universityofmurphy.commands;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class StudentCommand {
    private Long id;
    private String fname;
    private String lname;
    private Long  grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }
}
