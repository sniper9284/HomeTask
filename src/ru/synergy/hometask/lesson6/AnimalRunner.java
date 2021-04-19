package ru.synergy.hometask.lesson6;

import java.util.Arrays;
import java.util.List;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal any = new Animal("животные", "говорят");
        Animal dog = new Dog("собака", "ГАВ");
        Animal cat = new Cat("кот", "МЯУ");
        Animal horse = new Horse("лошадь", "ИГОГО");
        Animal parrot = new Parrot("попугай", "ЧИРИК");

        List<Animal> zoo = Arrays.asList(any, dog, cat, horse, parrot);
        for (Animal outSay : zoo) {
            outSay.voice();
        }
    }
}
