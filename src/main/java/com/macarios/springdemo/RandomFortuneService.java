package com.macarios.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {
            "No pain, no gain!",
            "May the wind be always at your back!",
            "Infinite patience produces immediate results!"
    };

    @Override
    public String getFortune() {
        int index = ThreadLocalRandom.current().nextInt(0, fortunes.length);
        return fortunes[index];
    }
}
