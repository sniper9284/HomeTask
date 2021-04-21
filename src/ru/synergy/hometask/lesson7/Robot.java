package ru.synergy.hometask.lesson7;

public class Robot {
    String name;
    int jump;
    int run;

    public Robot(String name) {
        this.name = name;
        int minj = 0;
        int maxj = 10;
        this.jump = minj + (int) (Math.random() * maxj);
        int minr = 0;
        int maxr = 100;
        this.run = minr + (int) (Math.random() * maxr);
    }

    public String jumper() {
        return "Робот: " + name + " прыгнул ";
    }

    public String runner() {
        return "Робот: " + name + " пробежал ";
    }
}
