package com.inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {


    public static void main(String[] args) {

        // Step 1: Load the spring configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-ApplicationContext.xml");

        // Step 2: Retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);
        // TODO:[ doMyStartupStuff ] method is called when initialize the bean.

        System.out.println(myCoach.getDailyFortune());
        // Close the context.
        context.close();
        // TODO:[ doMyDestroyStuff ] method is called when destroy the application.
    }
}
