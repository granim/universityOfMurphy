package com.universityofmurphy.services;

import com.universityofmurphy.commands.CourseCommand;
import com.universityofmurphy.converter.CourseCommandToCourse;
import com.universityofmurphy.converter.CourseToCourseCommand;
import com.universityofmurphy.domain.Course;
import com.universityofmurphy.repositories.CourseRepo;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final CourseCommandToCourse courseCommandToCourse;
    private final CourseToCourseCommand courseToCourseCommand;

    public CourseServiceImpl(CourseRepo courseRepo, CourseCommandToCourse courseCommandToCourse, CourseToCourseCommand courseToCourseCommand) {
        this.courseRepo = courseRepo;
        this.courseCommandToCourse = courseCommandToCourse;
        this.courseToCourseCommand = courseToCourseCommand;
    }

    @Override
    public Set<Course> getCourses() {
       Set<Course>courseSet = new HashSet<>();
       courseRepo.findAll().iterator().forEachRemaining(courseSet::add);
        return courseSet;
    }

    @Override
    public Course findById(Long l) {
        Optional<Course> courseOptional = courseRepo.findById(l);
        if(!courseOptional.isPresent()) {
            try {
                throw new NotFoundException("This course is not found " +  l.toString() );
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }
        return courseOptional.get();
    }

    @Override
    @Transactional
    public CourseCommand findCommandById(Long l) {
        return courseToCourseCommand.convert(findById(l));
    }

    @Override
    @Transactional
    public CourseCommand saveCourseCommand(CourseCommand command) {
        Course detachedCourse = courseCommandToCourse.convert(command);
        Course savedCourse = courseRepo.save(detachedCourse);
        return courseToCourseCommand.convert(savedCourse);
    }

    @Override
    public void deleteById(Long idToDelete) {
        courseRepo.deleteById(idToDelete);
    }
}
