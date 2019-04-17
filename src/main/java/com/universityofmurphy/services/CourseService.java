package com.universityofmurphy.services;

import com.universityofmurphy.domain.Course;


public interface CourseService extends CrudService<Course, Long> {

    String findCourse(String courseName);




}
