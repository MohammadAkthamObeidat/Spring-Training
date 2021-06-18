package com.inversionofcontrol;

public class CricketCoach implements Coach{

    private HappyFortuneService happyFortuneService;
    private String email;
    private String team;



    // Create no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: CONSTRUCTOR");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min.";
    }

    @Override
    public String getDailyFortune() {
        return this.happyFortuneService.getFortune();
    }

    public void setHappyFortuneService(HappyFortuneService happyFortuneService) {
        System.out.println("CricketCoach: SETTER METHOD");
        this.happyFortuneService = happyFortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
