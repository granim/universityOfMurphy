package com.universityofmurphy.repositories;

import com.universityofmurphy.domain.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepo extends CrudRepository<Student, Long> {

    @Override
    Optional<Student> findById(Long aLong);

}
