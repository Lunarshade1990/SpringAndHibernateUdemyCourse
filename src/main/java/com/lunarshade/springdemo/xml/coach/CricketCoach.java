package com.lunarshade.springdemo.xml.coach;

import com.lunarshade.springdemo.xml.fortune.FortuneService;

public class CricketCoach implements  Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: Внутри конструктора");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: внутри setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: внутри setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: внутри setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout() {
        return "Учись держать клюшку!";
    }

    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
