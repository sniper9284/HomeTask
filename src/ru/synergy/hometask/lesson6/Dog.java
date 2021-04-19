package ru.synergy.hometask.lesson6;

public class Dog extends Animal{

    public Dog(String name, String say) {
        super(name, say);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }
}
