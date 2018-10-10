package com.hannt.bo.module.sample.dao;

import com.hannt.bo.module.sample.domain.Course;

import java.util.List;

public interface CourseDao {
    Course store(Course course);
    void delete(Long courseId);
    Course findById(Long courseId);
    List<Course> findAll();
}
