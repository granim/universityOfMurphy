package com.universityofmurphy.services.map;

import com.universityofmurphy.domain.Student;
import com.universityofmurphy.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentMapService extends AbstractMapService<Student, Long> implements StudentService {


    @Override
    public Student findBylastName(String lname) {
        return null;
    }

    @Override
    public List<Student> findAllByLastName(String lname) {
        return null;
    }

    @Override
    public Set<Student> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Student object) {
            super.delete(object);
    }

    @Override
    public Student save(Student object) {
        return super.save(object);
    }

    @Override
    public Student findById(Long id) {
        return super.findById(id);
    }
}
