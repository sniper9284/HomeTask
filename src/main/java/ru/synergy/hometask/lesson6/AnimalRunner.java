package ru.synergy.hometask.lesson6;

import java.util.Arrays;
import java.util.List;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal any = new Animal("животные", "говорят");
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();
        Animal parrot = new Parrot();

        List<Animal> zoo = Arrays.asList(any, dog, cat, horse, parrot);
        for (Animal outSay : zoo) {
            outSay.voice();
        }
    }
}
