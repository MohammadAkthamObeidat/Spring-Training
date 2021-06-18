package com.AnnotationConfiguration.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService sadFortuneService;
    private FortuneService happyFortuneService;

    @Autowired
    @Qualifier("anotherFortuneService")
    private FortuneService anotherFortuneService;

    @Autowired
    public TennisCoach(@Qualifier("sadFortuneService") FortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getSadFortune() {
        return this.sadFortuneService.getFortune();
    }

    @Override
    public String getHappyFortune() {
        return this.happyFortuneService.getFortune();
    }

    @Override
    public String getAnotherFortune() {
        return this.anotherFortuneService.getFortune();
    }

    @Autowired
    public void setHappyFortuneService(FortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }

}
