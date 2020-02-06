package com.lunarshade.springdemo.xml.coach;

import com.lunarshade.springdemo.xml.fortune.FortuneService;

public class BaseballCoach implements Coach {

    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Тренируйся бегать 30 минут";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
