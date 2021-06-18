package com.AnnotationConfiguration.LifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    private final FortuneService sadFortuneService;
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


    // Define the Init method.
    @PostConstruct
    public String methodCalledAfterBeanInstantiated(){
        return "Doing some stuff after the bean initialized!";

    }

    // Define the destroy method.
    @PreDestroy
    public String methodCalledBeforeBeanDestroyed(){
        return "Doing some stuff before the bean destroyed!";
    }

}
