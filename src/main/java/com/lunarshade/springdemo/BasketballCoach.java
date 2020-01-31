package com.lunarshade.springdemo;

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
