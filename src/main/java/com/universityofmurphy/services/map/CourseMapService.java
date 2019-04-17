package com.universityofmurphy.services.map;

import com.universityofmurphy.domain.Course;
import com.universityofmurphy.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseMapService extends AbstractMapService<Course, Long> implements CourseService {
    

    @Override
    public String findCourse(String courseName) {
        Course savedCourse = null;
        return savedCourse.getCourseName();
    }

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
    public Course findById(Long id) {
        return super.findById(id);
    }
}
