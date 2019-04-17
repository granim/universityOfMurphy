package com.universityofmurphy.converter;

import com.universityofmurphy.commands.CourseCommand;
import com.universityofmurphy.domain.Course;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CourseToCourseCommand  implements Converter<Course, CourseCommand> {

    @Synchronized
    @Nullable
    @Override
    public CourseCommand convert(Course source){
        if(source == null) {
            return null;
        }

        final CourseCommand courseCommand = new CourseCommand();
        courseCommand.setId(source.getId());
        courseCommand.setCourseName(source.getCourseName());
        courseCommand.setStartDate(source.getStartDate());
        courseCommand.setEndDate(source.getEndDate());
        courseCommand.setStartTime(source.getStartTime());
        courseCommand.setStartDate(source.getStartDate());
        courseCommand.setEndTime(source.getEndTime());
        courseCommand.setTeacher(source.getTeacher());
        return courseCommand;
    }
}
