package com.universityofmurphy.controller;

import com.universityofmurphy.services.CourseService;
import org.springframework.stereotype.Controller;

@Controller
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }




}
