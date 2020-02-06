package com.lunarshade.springdemo.annotation;

import com.lunarshade.springdemo.annotation.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationContext.xml");
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        context.close();
    }
}
