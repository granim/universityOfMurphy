package com.universityofmurphy.services;

import com.universityofmurphy.domain.Teacher;

import java.util.List;

public interface TeacherService  extends CrudService<Teacher, Long> {

    Teacher findBylastName(String lname);
    List<Teacher> findAllByLastName(String lname);

}
