package com.xyh.validation;

import com.xyh.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author xyh
 * @version 1.0
 */
public class StudentValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        //返回值为true进入下面方法
        return Student.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name",null,"姓名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"password",null,"密码不能为空");
    }
}
