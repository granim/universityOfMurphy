package com.universityofmurphy.converter;

import com.universityofmurphy.commands.CourseCommand;
import com.universityofmurphy.domain.Course;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandToCourse  implements Converter<CourseCommand, Course> {

    @Synchronized
    @Nullable
    @Override
    public Course convert(CourseCommand source){
        if(source == null) {
            return null;
        }
        final Course course = new Course();
        course.setId(source.getId());
        course.setCourseName(source.getCourseName());
        course.setEndDate(source.getEndDate());
        course.setStartDate(source.getStartDate());
        course.setStartTime(source.getStartTime());

        return course;
    }

}
