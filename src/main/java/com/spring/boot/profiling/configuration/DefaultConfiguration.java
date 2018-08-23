package com.spring.boot.profiling.configuration;

import com.spring.boot.profiling.properties.MapStructProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

// to enable scheduling in spring
@EnableScheduling
@Configuration
@EnableConfigurationProperties({MapStructProperties.class})
public class DefaultConfiguration {

    @Autowired
    MapStructProperties mapStructProperties;

    static {
        System.out.println("===================DefaultConfiguration====================");
    }

    @PostConstruct
    void test(){
        System.out.println("MapStruct props:: "+mapStructProperties.getSourceTarget());
        System.out.println("MapStruct.purpose:: "+mapStructProperties.getPurpose());

    }
}
