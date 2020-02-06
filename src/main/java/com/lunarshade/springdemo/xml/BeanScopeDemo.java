package com.lunarshade.springdemo.xml;

import com.lunarshade.springdemo.xml.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
        Coach javaCoach = applicationContext.getBean("javaCoach", Coach.class);
        Coach javaCoach2 = applicationContext.getBean("javaCoach", Coach.class);
        System.out.println("Одинаковые ли эти объекты? " + (javaCoach==javaCoach2));
        System.out.println("javaCoach: " + javaCoach);
        System.out.println("javaCoach2: " + javaCoach2);
        applicationContext.close();
    }
}

