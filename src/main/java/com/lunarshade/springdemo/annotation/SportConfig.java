package com.lunarshade.springdemo.annotation;

import com.lunarshade.springdemo.annotation.coach.Coach;
import com.lunarshade.springdemo.annotation.coach.SwimCoach;
import com.lunarshade.springdemo.annotation.fortune.FortuneService;
import com.lunarshade.springdemo.annotation.fortune.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.lunarshade.springdemo.annotation")
public class SportConfig {

    //define a bean for a SadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    //define a bean for a SwimCoach
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
