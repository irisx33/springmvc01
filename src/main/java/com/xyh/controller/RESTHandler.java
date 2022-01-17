package com.xyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author xyh
 * @version 1.0
 */
@Controller
@RequestMapping("/rest")
public class RESTHandler {

//    @RequestMapping(value = "/find",method = RequestMethod.GET)
    @GetMapping("/find")
    public String find() {
        return "Hello";
    }

    @PostMapping("/save")
    public void save() {

    }

    @PutMapping("/update")
    @ResponseBody
    public String update(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return  "已接收到PUT请求";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return  "已接收到DELETE请求";
    }
}
