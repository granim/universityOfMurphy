package com.universityofmurphy.converter;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Student;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentToStudentCommand implements Converter<Student, StudentCommand> {

    public StudentCommand convert(Student source) {
        if(source == null) {
            return null;
        }

        final StudentCommand studentCommand = new StudentCommand();
        studentCommand.setId(source.getId());
        studentCommand.setLname(source.getLname());
        studentCommand.setFname(source.getFname());
        studentCommand.setGrade(source.getGrade());
        return studentCommand;


    }

}
