package com.lunarshade.springdemo.annotation.coach;

import com.lunarshade.springdemo.annotation.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("fileRandomFortuneService")
    FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">>TennisCoach: inside default constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Тренируй крученую подачу!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
