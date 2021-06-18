package com.AnnotationConfiguration.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationInversionOfControlDemoApp {

    public static void main(String[] args) {

        // Read Spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from Spring container
        Coach theCoach = context.getBean("myTennisCoach", Coach.class);

        // Call a method on a bean.
        System.out.println(theCoach.getDailyWorkout());

        // Close context.
        context.close();
    }

}
