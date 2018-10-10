package com.hannt.core.module.sample.service;

import com.hannt.core.module.sample.domain.Course;

public interface SampleService {
    String getString();
    void add(Course course);
    Course findById(Long id);

    default String getTest(){ return "test"; }
}
