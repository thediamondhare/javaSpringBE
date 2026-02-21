package com.springBEboot.demo.javaSpringBE.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// @Lazy(value = true)
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName() );
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k meters";
    }
}
