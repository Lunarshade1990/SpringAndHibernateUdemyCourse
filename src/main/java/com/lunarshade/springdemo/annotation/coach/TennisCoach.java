package com.lunarshade.springdemo.annotation.coach;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Тренируй крученую подачу!";
    }
}
