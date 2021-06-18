package com.inversionofcontrol;

public class TrackCoach implements Coach {

    private HappyFortuneService happyFortuneService;

    public TrackCoach(HappyFortuneService happyFortuneService){
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it "+this.happyFortuneService.getFortune();
    }

    // Add an init method.
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // Add a destroy method.
    public void doMyDestroyStuff(){
        System.out.println("TrackCoach: inside method doMyDestroyStuff");
    }
}
