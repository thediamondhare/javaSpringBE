package com.springBEboot.demo.javaSpringBE.config;

import com.springBEboot.demo.javaSpringBE.common.Coach;
import com.springBEboot.demo.javaSpringBE.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
