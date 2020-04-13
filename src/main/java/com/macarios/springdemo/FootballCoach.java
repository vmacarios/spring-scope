package com.macarios.springdemo;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 5 goals from 5 different positions (and distances).";
    }

    @Override
    public String getDailyFortune() {
        return "Today fortune: " + fortuneService.getFortune();
    }
}
