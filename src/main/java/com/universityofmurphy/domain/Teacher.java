package com.universityofmurphy.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher extends Person  {

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "teacher_courses", joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courseSet = new HashSet<>();

}
