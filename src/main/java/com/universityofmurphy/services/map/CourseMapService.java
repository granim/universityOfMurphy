package com.universityofmurphy.services.map;

import com.universityofmurphy.commands.CourseCommand;
import com.universityofmurphy.domain.Course;
import com.universityofmurphy.services.CourseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class CourseMapService extends AbstractMapService<Course, Long> implements CourseService {

    @Override
    public Set<Course> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Course object) {
        super.delete(object);
    }

    @Override
    public Course save(Course object) {
        return super.save(object);
    }

    @Override
    public Set<Course> getCourses() {
        return null;
    }

    @Override
    public Course findById(Long id) {
        return super.findById(id);
    }

    @Override
    public CourseCommand findCommandById(Long l) {
        return null;
    }

    @Override
    public CourseCommand saveCourseCommand(CourseCommand course) {
        return null;
    }
}
