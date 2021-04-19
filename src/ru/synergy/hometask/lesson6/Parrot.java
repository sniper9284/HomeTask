package ru.synergy.hometask.lesson6;

public class Parrot extends Animal {
    public Parrot(String name, String say) {
        super(name, say);
    }

    @Override
    public void voice() {
        System.out.println(toString() + " и красиво пою.");
    }
}
