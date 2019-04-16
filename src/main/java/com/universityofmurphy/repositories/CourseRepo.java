package com.universityofmurphy.repositories;

import com.universityofmurphy.domain.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepo extends CrudRepository<Course, Long> {

    @Override
    Optional<Course> findById(Long aLong);
}
