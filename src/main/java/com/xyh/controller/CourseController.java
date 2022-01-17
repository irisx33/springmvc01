package com.xyh.controller;

import com.xyh.entity.Course;
import com.xyh.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author xyh
 * @version 1.0
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    private CourseRepository courseRepository;

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        Collection<Course> all = courseRepository.findAll();
        modelAndView.addObject("list",all);
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Course course) {
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        courseRepository.deleteById(id);
        return "redirect:/course/findAll";
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("course", courseRepository.findById(id));
        return modelAndView;
    }

    @PutMapping("/update")
    public String update(Course course) {
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }
}
