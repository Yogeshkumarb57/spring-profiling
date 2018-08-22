package com.spring.boot.profiling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

// to enable scheduling in spring
@EnableScheduling
@Configuration
public class DefaultConfiguration {

    static {
        System.out.println("===================DefaultConfiguration====================");
    }
}
