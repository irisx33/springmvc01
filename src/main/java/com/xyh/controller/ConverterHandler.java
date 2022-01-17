package com.xyh.controller;

import com.xyh.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author xyh
 * @version 1.0
 */
@Controller
@RequestMapping("/converter")
public class ConverterHandler {

    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date) {
        return date.toString();
    }

    @RequestMapping("/student")
    @ResponseBody
    public String student(Student student, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return student.toString();
    }
}
