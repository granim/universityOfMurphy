package com.universityofmurphy.converter;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Course;
import com.universityofmurphy.domain.Student;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class StudentToStudentCommand implements Converter<Student, StudentCommand> {

    private final CourseToCourseCommand courseConverter;

    public StudentToStudentCommand(CourseToCourseCommand courseConverter) {
        this.courseConverter = courseConverter;
    }


    @Synchronized
    @Nullable
    @Override
    public StudentCommand convert(Student source) {
        if(source == null) {
            return null;
        }

        final StudentCommand studentCommand = new StudentCommand();
        studentCommand.setId(source.getId());
        studentCommand.setLname(source.getLname());
        studentCommand.setFname(source.getFname());
        studentCommand.setGrade(source.getGrade());
        if(source.getCourses() != null && source.getCourses().size() > 0) {
            source.getCourses()
                    .forEach((Course course) -> studentCommand.getCourses().add(courseConverter.convert(course)));
        }
        return studentCommand;


    }

}
