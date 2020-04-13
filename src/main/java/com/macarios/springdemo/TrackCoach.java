package com.macarios.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    //add an init method
    private void doMyStartupStuff() {
        System.out.println("TrackCoach: Inside method doMyStartupStuff");
    }

    //add a destroy method
    private void doMyCleanupStuff() {
        System.out.println("TrackCoach: Inside method doMyCleanupStuff");
    }

}
