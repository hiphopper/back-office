package com.hannt.bo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(
    basePackages = "com.hannt.bo.module",
    includeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = {Controller.class, RestController.class}
    ),
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASPECTJ,
        pattern = {"com.hannt.bo..service.*+", "com.hannt.bo..repository.*+"}
            //classes = {Service.class, Repository.class}
    )
)
public class WebConfig implements WebMvcConfigurer {
}
