package com.AnnotationConfiguration.NoXML;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    @Value("${foo.email}") // Get the value from .properties file ( Field level injection)
    String email;

    @Value("${foo.team}") // Get the value from .properties file ( Field level injection)
    String team;

    private final FortuneService happyFortuneService;

    public SwimCoach(@Qualifier("happyFortuneService") FortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a warm up";
    }

    @Override
    public String getHappyFortune() {
        return this.happyFortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
