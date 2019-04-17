package com.universityofmurphy.converter;


import com.universityofmurphy.commands.TeacherCommand;
import com.universityofmurphy.domain.Teacher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TeacherToTeacherCommand implements Converter<Teacher, TeacherCommand> {

    @Override
    public TeacherCommand convert(Teacher source) {
        if(source == null) {
            return null;
        }
        final TeacherCommand teacherCommand = new TeacherCommand();
        teacherCommand.setId(source.getId());
        teacherCommand.setfName(source.getFname());
        teacherCommand.setlName(source.getLname());
        return teacherCommand;
    }
}
