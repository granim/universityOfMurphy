package com.universityofmurphy.services;

import com.universityofmurphy.domain.Teacher;

import java.util.Optional;
import java.util.Set;

public interface TeacherService  {


    Optional<Teacher> findBylastName(String lname);
    Set<Teacher> findAllByLastName(String lname);

}
