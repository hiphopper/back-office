package com.hannt.core.module.sample.service.impl;

import com.hannt.core.module.sample.domain.Course;
import com.hannt.core.module.sample.repository.CourseRepository;
import com.hannt.core.module.sample.service.SampleService;

public abstract class SampleServiceImpl implements SampleService {
    protected CourseRepository courseRepository;

    @Override
    public void add(Course course){
        courseRepository.save(course);
    }

    @Override
    public Course findById(Long id){
        return courseRepository.findById(id).orElse(null);
    }
}
