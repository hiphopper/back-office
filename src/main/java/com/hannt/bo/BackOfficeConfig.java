package com.hannt.bo;

import com.hannt.bo.config.WebConfig;
import com.hannt.core.RootConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Import(RootConfig.class)
@ComponentScan(
    excludeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = {Controller.class, RestController.class}
    ), @ComponentScan.Filter( type = FilterType.ASSIGNABLE_TYPE, classes = WebConfig.class)}
)
public class BackOfficeConfig {
}
