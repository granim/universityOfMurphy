package com.universityofmurphy.services;

import com.universityofmurphy.domain.Teacher;
import com.universityofmurphy.repositories.TeacherRepo;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Optional<Teacher> findBylastName(String lname) {
        return teacherRepo.findByLastName(lname);
    }

    @Override
    public Set<Teacher> findAllByLastName(String lName) {
        Set<Teacher> teacherSet = new HashSet<>();
        teacherRepo.findAll().iterator().forEachRemaining(teacherSet::add);
        return teacherSet;
    }

}
