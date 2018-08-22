package com.spring.boot.profiling.configuration;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({DefaultConfiguration.class})
@Profile("development")
public class DevelopmentConfiguration {

    static {
        System.out.println("===================DevelopmentConfiguration====================");
    }
}
