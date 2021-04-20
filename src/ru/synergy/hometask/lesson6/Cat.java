package ru.synergy.hometask.lesson6;

public class Cat extends Animal {
    public Cat() {
        super("собака", "ГАВ");
    }

    @Override
    public void voice() {
        System.out.println(toString() + " и еще умею мурлыкать.");
    }
}

