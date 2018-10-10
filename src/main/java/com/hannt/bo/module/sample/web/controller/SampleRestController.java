package com.hannt.bo.module.sample.web.controller;

import com.hannt.core.module.sample.domain.Course;
import com.hannt.core.module.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/api")
public class SampleRestController {
    @Autowired
    private SampleService sampleService;

    @GetMapping
    public String getString(){
        return sampleService.getString();
    }

    @GetMapping("findById/{id}")
    public Course getString(@PathVariable Long id){
        return sampleService.findById(id);
    }

    @GetMapping("/add")
    public String add(){
        Course course = Course.builder()
                .title("ggg")
                .build();
        sampleService.add(course);

        return course.toString();
    }
}
