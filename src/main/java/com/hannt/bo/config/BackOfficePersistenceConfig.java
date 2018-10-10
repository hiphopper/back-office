package com.hannt.bo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class BackOfficePersistenceConfig {

    @Bean("dataSource")
    @Profile("local")
    public DataSource localDataSource(
            @Value("${database.local.url}") String url,
            @Value("${database.local.username}") String username,
            @Value("${database.local.password}") String password,
            @Value("${database.driverClassName}") String driverClassName
    ){
        return dataSource(url, username, password, driverClassName);
    }

    @Bean("dataSource")
    @Profile("dev")
    public DataSource devDataSource(
            @Value("${database.dev.url}") String url,
            @Value("${database.dev.username}") String username,
            @Value("${database.dev.password}") String password,
            @Value("${database.driverClassName}") String driverClassName
    ){
        return dataSource(url, username, password, driverClassName);
    }

    private DataSource dataSource(String url, String username, String password, String driverClassName){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(url);
        dataSource.setMinimumIdle(2);
        dataSource.setMaximumPoolSize(100);

        return dataSource;
    }
}
