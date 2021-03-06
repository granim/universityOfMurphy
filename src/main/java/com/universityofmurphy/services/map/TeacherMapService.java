package com.universityofmurphy.services.map;

import com.universityofmurphy.domain.Teacher;
import com.universityofmurphy.services.TeacherService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@Profile("map")
public class TeacherMapService extends AbstractMapService<Teacher, Long> implements TeacherService {

    @Override
    public Optional<Teacher> findBylastName(String lname) {
        return null;
    }

    @Override
    public Set<Teacher> findAllByLastName(String lname) {
        return null;
    }

    @Override
    public Set<Teacher> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Teacher object) {
        super.delete(object);
    }

    @Override
    public Teacher save(Teacher object) {
        return super.save(object);
    }

    @Override
    public Teacher findById(Long id) {
        return super.findById(id);
    }
}
