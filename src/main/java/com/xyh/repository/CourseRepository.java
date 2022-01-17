package com.xyh.repository;

import com.xyh.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xyh
 * @version 1.0
 */
@Repository
public class CourseRepository {
    private Map<Integer, Course> courseMap;

    public CourseRepository() {
        courseMap = new HashMap<>();
        courseMap.put(1, new Course(1, "Java基础", 500.0));
        courseMap.put(2, new Course(2,"Java高级", 600.0));
        courseMap.put(3, new Course(3,"企业级框架", 700.0));
    }

    public Collection<Course> findAll() {
        return courseMap.values();
    }

    public Course findById(Integer id) {
        return courseMap.get(id);
    }

    public void saveOrUpdate(Course course) {
        courseMap.put(course.getId(), course);
    }

    public void deleteById(Integer id) {
        courseMap.remove(id);
    }
}
