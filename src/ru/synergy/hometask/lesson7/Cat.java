package ru.synergy.hometask.lesson7;

public class Cat implements Games {
    String name;
    int jump;
    int run;

    public Cat(String name) {
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
        return "Кот: " + name + " прыгнул ";
    }

    @Override
    public String runner() {
        return "Кот: " + name + " пробежал ";
    }
}
