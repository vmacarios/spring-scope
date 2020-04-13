package com.macarios.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExercise {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeExercise-applicationContext.xml");

        // retrieve bean from spring container
        Coach firstCoach = context.getBean("footballCoach", Coach.class);
        Coach secondCoach = context.getBean("footballCoach", Coach.class);

        // call methods on the bean
        System.out.println(firstCoach.getDailyWorkout());

        // call new method for fortunes
        System.out.println(secondCoach.getDailyFortune());
        
        //check if the instances are the same
        boolean result = (firstCoach == secondCoach);

        //print the result and the memory location
        System.out.println("They are the same object: " + result);
        System.out.println("firstCoach memory location: " + firstCoach);
        System.out.println("secondCoach memory location: " + secondCoach);

        // close the context
        context.close();
    }
}
