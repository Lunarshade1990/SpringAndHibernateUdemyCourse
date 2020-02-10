package com.lunarshade.springdemo.annotation.fortune;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    List<String> fortunes;


    public RandomFortuneService() {
        fortunes = new ArrayList<>();
        fortunes.add("Сегодня удачный день!");
        fortunes.add("Тебя ждёт приглашение на работу!");
        fortunes.add("Босс повысит тебе зарплату!");
    }

    @Override
    public String getFortune() {
        return this.fortunes.get(
                getRandomIndex(fortunes.size())
        );
    }

    private int getRandomIndex(int size) {
        return new Random().nextInt(size);
    }
}
