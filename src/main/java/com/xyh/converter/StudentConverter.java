package com.xyh.converter;

import com.xyh.entity.Student;
import org.springframework.core.convert.converter.Converter;

/**
 * @author xyh
 * @version 1.0
 */
public class StudentConverter implements Converter<String, Student> {
    @Override
    public Student convert(String s) {
        String[] args = s.split("-");
        Student student = new Student();
//        student.setId(Integer.parseInt(args[0]));
        student.setName(args[1]);
//        student.setAge(Integer.parseInt(args[2]));
        return student;
    }
}
