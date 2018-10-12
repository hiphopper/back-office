package com.hannt.bo.module.sample.service;

import com.hannt.core.module.sample.repository.CourseRepository;
import com.hannt.core.module.sample.service.impl.SampleServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional(readOnly = true)
public class BackOfficeSampleServiceImpl extends SampleServiceImpl {

    public BackOfficeSampleServiceImpl(CourseRepository courseRepository){
        super.courseRepository = courseRepository;
    }

    @Override
    public String getString() {
        return String.valueOf(courseRepository.findAll().stream()
                .count());
    }

    @Cacheable(value = "codeCache")
    public String getCache(){
        return new Date().toString();
    }
}
