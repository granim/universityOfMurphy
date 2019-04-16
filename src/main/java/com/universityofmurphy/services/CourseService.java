package com.universityofmurphy.services;

import com.universityofmurphy.domain.Course;

import java.util.List;

public interface CourseService extends CrudService<Course, Long> {

    Course findCourse(String courseName);

    List<Course> findAllCourses(String courseName);

}
