package com.lunarshade.springdemo.annotation;

import com.lunarshade.springdemo.annotation.coach.Coach;
import com.lunarshade.springdemo.annotation.coach.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimAnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach tennisCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        context.close();
    }
}
