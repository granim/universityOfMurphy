package com.universityofmurphy.services.map;

import com.universityofmurphy.commands.StudentCommand;
import com.universityofmurphy.domain.Student;
import com.universityofmurphy.services.StudentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class StudentMapService extends AbstractMapService<Student, Long> implements StudentService {


    @Override
    public Set<Student> findAll() {
        return super.findAll();
    }

    @Override
    public Student findByStudentId(Long l) {
        return null;
    }

    @Override
    public StudentCommand saveById(Long studentId) {
        return null;
    }

    @Override
    public StudentCommand findAllCourse(Long courseId) {
        return null;
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
