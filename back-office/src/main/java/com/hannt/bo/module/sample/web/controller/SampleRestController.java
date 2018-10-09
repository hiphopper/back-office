package com.hannt.bo.module.sample.web.controller;

import com.hannt.core.module.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
