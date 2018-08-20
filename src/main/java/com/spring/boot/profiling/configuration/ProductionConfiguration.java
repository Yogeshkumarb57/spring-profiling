package com.spring.boot.profiling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionConfiguration {

    static {
        System.out.println("===================ProductionConfiguration====================");
    }

}
