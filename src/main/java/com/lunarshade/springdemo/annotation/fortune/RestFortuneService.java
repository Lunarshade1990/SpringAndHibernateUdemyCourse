package com.lunarshade.springdemo.annotation.fortune;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
