package ru.synergy.hometask.lesson7;

public class Wall {
    int h;

    public Wall() {
        int min = 1;
        int max = 10;
        this.h = min + (int) (Math.random() * max);
    }

    public int getH() {
        return h;
    }

    public String jumpW() {
        return " пробежал " + h + "метров.";
    }
}
