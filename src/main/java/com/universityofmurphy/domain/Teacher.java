package com.universityofmurphy.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher extends Person  {

    @Builder
    public Teacher(Long id, String fname, String lname, Set<Course> courses) {
        super(id, fname, lname);
        this.courses = courses;
    }

    @Override
    public boolean isNew() {
        return super.isNew();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getFname() {
        return super.getFname();
    }

    @Override
    public void setFname(String fname) {
        super.setFname(fname);
    }

    @Override
    public String getLname() {
        return super.getLname();
    }

    @Override
    public void setLname(String lname) {
        super.setLname(lname);
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "teacher_courses", joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();

}
