package com.spring.boot.profiling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevelopmentConfiguration {

    static {
        System.out.println("===================DevelopmentConfiguration====================");
    }
}
