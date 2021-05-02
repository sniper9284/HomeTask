package ru.synergy.hometask.lesson7;

public class Wall implements Block {
    int min = 0;
    int max = 10;
    int height = min + (int) (Math.random() * max);

    @Override
    public String block() {
        return " на высоту " + height;
    }

    @Override
    public String fail() {
        return " ниже " + height + " и выбывает!";
    }
}
