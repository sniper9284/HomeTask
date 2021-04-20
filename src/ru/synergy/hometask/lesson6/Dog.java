package ru.synergy.hometask.lesson6;

public class Dog extends Animal{

    public Dog() {
        super("собака", "ГАВ");
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }
}
