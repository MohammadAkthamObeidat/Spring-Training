package com.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {


    public static void main(String[] args) {

        // Step 1: Load the spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");

        // Step 2: Retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same instance
        boolean isSame = myCoach == alphaCoach;

        System.out.println(isSame);
        System.out.println("Memory location for myCoach: "+myCoach);
        System.out.println("Memory location for alphaCoach: "+alphaCoach);

        // Close the context.
        context.close();
    }
}
