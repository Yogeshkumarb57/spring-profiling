package com.spring.boot.profiling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DefaultConfiguration {

    static {
        System.out.println("===================DefaultConfiguration====================");
    }
}
