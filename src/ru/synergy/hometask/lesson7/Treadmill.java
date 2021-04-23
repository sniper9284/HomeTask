package ru.synergy.hometask.lesson7;

public class Treadmill implements Block {
    int min = 0;
    int max = 100;
    int distance = min + (int) (Math.random() * max);

    @Override
    public String block() {
        return " дистанцию " + distance;
    }

    @Override
    public String fail() {
        return " меньше " + distance + " и выбывает!";
    }
}
