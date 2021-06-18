package com.inversionofcontrol;

public class FootballCoach implements Coach{

    // Define a private field for the dependency
    private final HappyFortuneService happyFortuneService;

    // Define a constructor for dependency injection
    public FootballCoach(HappyFortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 15 minutes practicing on free-kicks";
    }

    @Override
    public String getDailyFortune() {
        // Use the dependency to get the fortune.
        return this.happyFortuneService.getFortune();
    }
}
