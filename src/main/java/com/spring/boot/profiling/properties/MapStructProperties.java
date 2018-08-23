package com.spring.boot.profiling.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

//retrieve property file
@PropertySource("classpath:mapstruct.properties")
//to enable bean creation
@Configuration
@ConfigurationProperties(prefix = "mapstruct")
public class MapStructProperties {

    String purpose="purpose";

    Map<String,String> sourceTarget=new HashMap<>();

    public Map<String, String> getSourceTarget() {
        return sourceTarget;
    }

    public void setSourceTarget(Map<String, String> sourceTarget) {
        this.sourceTarget = sourceTarget;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
