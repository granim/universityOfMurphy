package com.universityofmurphy.converter;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Student;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentCommandToStudent implements Converter<StudentCommand, Student> {

    private final CourseCommandToCourse courseConverter;

    public StudentCommandToStudent(CourseCommandToCourse courseConverter) {
        this.courseConverter = courseConverter;
    }

    public Student convert(StudentCommand source){
        if(source == null) {
            return null;
        }

        final Student student = new Student();
        student.setId(source.getId());
        student.setGrade(source.getGrade());
        student.setFname(source.getFname());
        student.setLname(source.getLname());
        if(source.getCourses() != null && source.getCourses().size() > 0) {
            source.getCourses()
                    .forEach(course -> student.getCourses().add(courseConverter.convert(course)));
        }

        return student;
    }



}
