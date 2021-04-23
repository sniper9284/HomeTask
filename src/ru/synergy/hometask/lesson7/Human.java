package ru.synergy.hometask.lesson7;

public class Human implements Games {
    String name;
    int jump;
    int run;

    public Human(String name) {
        this.name = name;
        int minj = 0;
        int maxj = 10;
        this.jump = minj + (int) (Math.random() * maxj);
        int minr = 0;
        int maxr = 100;
        this.run = minr + (int) (Math.random() * maxr);
    }

    @Override
    public String jamper() {
        return "Человек: " + name + " прыгнул ";
    }

    @Override
    public String runner() {
        return "Человек: " + name + " пробежал ";
    }
}
