package com.lunarshade.springdemo.xml.coach;

import com.lunarshade.springdemo.xml.fortune.FortuneService;

public class JavaCoach implements Coach  {

    FortuneService fortuneService;

    public JavaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Learn JDBC today!";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
