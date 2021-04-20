package ru.synergy.hometask.lesson7;

public class Human {
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

    public String getName() {
        return name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public String jumper() {
        return "Человек: " + name;
    }

    public String runner() {
        return "Человек: " + name;
    }
}
