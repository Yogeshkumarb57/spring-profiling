package com.spring.boot.profiling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({DefaultConfiguration.class})
@Profile("production")
public class ProductionConfiguration {

    static {
        System.out.println("===================ProductionConfiguration====================");
    }

}
