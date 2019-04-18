package com.universityofmurphy.services;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Student;

public interface StudentService {

    Student findByStudentId(Long l);
    StudentCommand saveById(Long studentId);
    StudentCommand findAllCourse(Long courseId);
    void deleteById(Long studentId);

}
