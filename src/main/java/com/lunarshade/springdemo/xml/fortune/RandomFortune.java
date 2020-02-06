package com.lunarshade.springdemo.xml.fortune;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService {

    List<String> fortunes;

    private final static int nkjn = 1;



    public RandomFortune() {
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
