package ru.synergy.hometask.lesson6;

public class Cat extends Animal {
    public Cat(String name, String say) {
        super(name, say);
    }

    @Override
    public void voice() {
        System.out.println(toString() + " и еще умею мурлыкать.");
    }
}

