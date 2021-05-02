package ru.synergy.hometask.lesson6;

public class Parrot extends Animal {
    public Parrot() {
        super("попугай", "ЧИРИК");
    }

    @Override
    public void voice() {
        System.out.println(toString() + " и красиво пою.");
    }
}
