package com.AnnotationConfiguration.NoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationNoXMLDemoApp {

    public static void main(String[] args) {

        // Read Spring container configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

        // Retrieve the bean from the container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getHappyFortune());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        // Close the context
        context.close();
    }
}
