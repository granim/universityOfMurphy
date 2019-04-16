package com.universityofmurphy.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends BaseEntity{

    public Student(Long id, String fname, String lname, Long grade, Set<Course> courses) {
        super(id);
        this.lname = lname;
        this.fname = fname;
        this.grade = grade;
        if(courses != null) {
            this.courses = courses;
        }
    }

    @Column(name = "fisrtName")
    private String fname;

    @Column(name = "lastName")
    private String lname;

    @Column(name = "grade")
    private Long grade;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Course> courses = new HashSet<>();

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    //Finds all courses associated with a particular student
    public Set<Course> getCourses(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for(Course course: courses) {
            if(!ignoreNew || !course.isNew()){
                String compName = course.getCourseName();
                compName = compName.toLowerCase();
                    if(compName.equals(name)){
                        return courses;
                    }
            }
        }
        return null;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
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

    public Set<Course> getCourses() {
        return courses;
    }
}
