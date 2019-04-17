package com.universityofmurphy.services;

import com.universityofmurphy.domain.Student;

import java.util.List;

public interface StudentService extends CrudService<Student, Long> {

    Student findBylastName(String lname);
    List<Student> findAllByLastName(String lname);


}
