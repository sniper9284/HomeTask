package ru.synergy.hometask.lesson6;

public class Animal {
    String name;
    String say;

    public Animal(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public Animal() {
    }

    public void voice() {
        System.out.println("Все " + name + " " + say + " по разному.");
    }

    @Override
    public String toString() {
        return "Я " + name + " я говорю  " + say;
    }
}
