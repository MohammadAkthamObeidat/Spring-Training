package com.AnnotationConfiguration.DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDependencyInjectionDemoApp {

    public static void main(String[] args) {

        // Read Spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from Spring container
        Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        // Call a method on a bean.
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getSadFortune()); // This is done by constructor injection
        System.out.println(theCoach.getHappyFortune()); // This is done by setter injection.
        System.out.println(theCoach.getAnotherFortune()); // This is done by field injection.

        // Close context.
        context.close();
    }
}
