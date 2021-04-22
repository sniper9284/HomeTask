package ru.synergy.hometask.lesson7;

public class Wall implements Block {
    int min = 0;
    int max = 10;
    int height = min + (int) (Math.random() * max);

    @Override
    public void block() {
        System.out.println(" на высоту " + height);
    }

    @Override
    public void fail() {
        System.out.println(" ниже " + height + " и выбывает!");
    }
}