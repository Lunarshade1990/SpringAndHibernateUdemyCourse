package com.lunarshade.springdemo.xml.coach;

import com.lunarshade.springdemo.xml.fortune.FortuneService;

public class BasketballCoach implements Coach {

    FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return  "Тренируйся вести мяч 30 минут";
    }

    public String getDailyFortune() {
        return "Эй, парень! " + fortuneService.getFortune();
    }
}
