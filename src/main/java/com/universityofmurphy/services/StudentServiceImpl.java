package com.universityofmurphy.services;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.converter.StudentCommandToStudent;
import com.universityofmurphy.converter.StudentToStudentCommand;
import com.universityofmurphy.domain.Student;
import com.universityofmurphy.repositories.StudentRepo;
import javassist.NotFoundException;

import java.util.Optional;

public class StudentServiceImpl implements   StudentService{

    private final StudentRepo studentRepo;
    private final StudentCommandToStudent studentCommandToStudent;
    private final StudentToStudentCommand studentToStudentCommand;

    public StudentServiceImpl(StudentRepo studentRepo, StudentCommandToStudent studentCommandToStudent, StudentToStudentCommand studentToStudentCommand) {
        this.studentRepo = studentRepo;
        this.studentCommandToStudent = studentCommandToStudent;
        this.studentToStudentCommand = studentToStudentCommand;
    }

    @Override
    public Student findByStudentId(Long l) {
        Optional<Student> studentOptional = studentRepo.findById(l);
        if(!studentOptional.isPresent()) {
            try {
                throw new NotFoundException("This student is not found" + l.toString());
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }
        return studentOptional.get();
    }

    @Override
    public StudentCommand saveById(Long studentId) {
        return null;
    }

    @Override
    public StudentCommand findAllCourse(Long courseId) {
        return null;
    }

    @Override
    public void deleteById(Long studentId) {

    }
}
