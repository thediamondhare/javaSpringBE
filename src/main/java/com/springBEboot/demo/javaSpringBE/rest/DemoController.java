package com.springBEboot.demo.javaSpringBE.rest;

import com.springBEboot.demo.javaSpringBE.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    // private Coach anotherCoach;

    // constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach
                         /* , @Qualifier("cricketCoach") Coach theAnotherCoach */) {

        System.out.println("In constructor: " + getClass().getSimpleName() );
        myCoach = theCoach;
        // anotherCoach = theAnotherCoach;
    }


    @Autowired
    public void setCoach(@Qualifier("aquatic") Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/demoworkout")
    public String getDemoWorkout() {
        return myCoach.getDailyWorkout();
    }

    /*
    @GetMapping("/check")
    public String check() {
        return "Comparing bean - myCoach and anotherCoach : " + (myCoach == anotherCoach);
    }
    */


}
