package com.universityofmurphy.controller;

import com.universityofmurphy.services.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {


    private final CourseService courseService;

    public IndexController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
