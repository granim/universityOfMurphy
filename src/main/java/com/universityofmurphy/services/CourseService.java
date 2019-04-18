package com.universityofmurphy.services;

import com.universityofmurphy.commands.CourseCommand;
import com.universityofmurphy.domain.Course;

import java.util.Set;


public interface CourseService  {

    Set<Course> getCourses();

    Course findById(Long l);

    CourseCommand findCommandById(Long l);

    CourseCommand saveCourseCommand(CourseCommand course);

    void deleteById(Long idToDelete);




}
