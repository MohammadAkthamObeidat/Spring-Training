package com.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


    public static void main(String [] args){

        // Step 1: Load the spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Step 2: Retrieve bean from spring container.
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // Step 3: Call methods on the bean.
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        // Print out the injected Literals values
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());

        // Step 4: Close the actual application context.
        context.close();
    }

   /* public static void main(String [] args){
        // Create the object
        Coach footballCoach = new FootballCoach();
        Coach trackCoach = new TrackCoach();

        // Use the object
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
    }*/
}
