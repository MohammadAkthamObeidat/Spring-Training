package com.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String [] args){

        /*
                           ###### Inversion Of Control In Action (Steps to get bean class object from XML configuration file). ######
         */
        // Step 1: Load the spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Step 2: Retrieve bean from spring container.
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);
        // Step 3: Call methods on the bean.
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myTrackCoach.getDailyWorkout());

        // Call our new method for fortunes.
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myTrackCoach.getDailyFortune());

        // Step 4: Close the actual application context.
        context.close();

    }
}
