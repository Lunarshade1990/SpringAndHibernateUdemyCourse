package com.lunarshade.springdemo.annotation.coach;

import com.lunarshade.springdemo.annotation.fortune.FortuneService;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
