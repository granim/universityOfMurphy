package com.universityofmurphy.converter;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Student;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentCommandToStudent implements Converter<StudentCommand, Student> {

    public Student convert(StudentCommand source){
        if(source == null) {
            return null;
        }

        final Student student = new Student();
        student.setId(source.getId());
        student.setGrade(source.getGrade());
        return student;
    }



}
