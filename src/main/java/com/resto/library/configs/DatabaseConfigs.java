package com.resto.library.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

// to have this JdbcTemplate in our application context, we use the configuration patterns in spring boot for detecting the Beans which defined here via the Component Scan 
@Configuration
public class DatabaseConfigs {
    @Bean
    // jdbc template requires a datasource 
    public JdbcTemplate jdbcTemp(final DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}