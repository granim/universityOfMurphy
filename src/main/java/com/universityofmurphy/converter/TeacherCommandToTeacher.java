package com.universityofmurphy.converter;

import com.universityofmurphy.commands.TeacherCommand;
import com.universityofmurphy.domain.Teacher;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class TeacherCommandToTeacher implements Converter<TeacherCommand, Teacher> {

    @Synchronized
    @Nullable
    @Override
    public Teacher convert(TeacherCommand source) {
        if(source == null) {
            return null;
        }
        final Teacher teacher = new Teacher();
        teacher.setId(source.getId());
        teacher.setFname(source.getfName());
        teacher.setLname(source.getlName());
        return teacher;
    }

}
