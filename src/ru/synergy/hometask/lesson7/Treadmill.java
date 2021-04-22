package ru.synergy.hometask.lesson7;

public class Treadmill implements Block {
    int min = 0;
    int max = 100;
    int distance = min + (int) (Math.random() * max);

    @Override
    public void block() {
        System.out.println(" дистанцию " + distance);
    }

    @Override
    public void fail() {
        System.out.println(" меньше " + distance + " и выбывает!");
    }
}
