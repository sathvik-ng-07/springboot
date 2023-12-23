package com.gfg.demo.config;

import com.gfg.demo.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for creating Spring beans related to the application.
 */
@Configuration
@ComponentScan(basePackages = "com.gfg.demo")
public class AppConfig {

    /**
     * Bean definition method to create a 'Student' bean.
     *
     * @return An instance of the 'Student' class with ID 1 and name "Geek".
     */
    @Bean
    public Student student() {
        return new Student(1, "Geek");
    }
}

