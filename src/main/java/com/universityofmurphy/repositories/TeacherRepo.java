package com.universityofmurphy.repositories;

import com.universityofmurphy.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TeacherRepo extends CrudRepository<Teacher, Long> {

        Optional<Teacher> findById(Long aLong);

        Optional<Teacher> findByLastName(String lName);
}
