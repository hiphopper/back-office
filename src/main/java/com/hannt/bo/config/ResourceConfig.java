package com.hannt.bo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@PropertySource(value = {"classpath:properties/env/database.properties", "classpath:properties/env/system.properties"})
public class ResourceConfig {

    /**
     * @PropertySource 를 사용해서 프로퍼티 파일을 로드하려면 선언해야함.
     * @return
     */
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    /**
     * 인스턴스는 반드시 messageSource()라고 명명해야 컨텍스트가 알아서 감지함.
     * @return
     */
    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:i18n/messages", "classpath:i18n/validation");
        messageSource.setCacheSeconds(60);
        return messageSource;
    }
}
