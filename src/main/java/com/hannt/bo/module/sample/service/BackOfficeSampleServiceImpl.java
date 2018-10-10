package com.hannt.bo.module.sample.service;

import com.hannt.core.module.sample.repository.CourseRepository;
import com.hannt.core.module.sample.service.impl.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BackOfficeSampleServiceImpl extends SampleServiceImpl {
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository){
        super.courseRepository = courseRepository;
    }

    @Override
    public String getString() {
        return String.valueOf(courseRepository.findAll().stream()
                .count());
    }
}
