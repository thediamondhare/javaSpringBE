package com.springBEboot.demo.javaSpringBE.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope (ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope (ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName() );
    }

    // init method, used after class element is constructed
    @PostConstruct
    public void startUpStaff() {
        System.out.println("In startUpStaff: " + getClass().getSimpleName() );
    }

    // destroy method, used before class element is destroyed
    @PreDestroy
    public void shutdownStaff() {
        System.out.println("In shutdownStaff: " + getClass().getSimpleName() );
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

}

