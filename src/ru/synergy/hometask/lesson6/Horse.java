package ru.synergy.hometask.lesson6;

public class Horse extends Animal {
    public Horse() {
        super("лошадь", "ИГОГО");
    }

    @Override
    public void voice() {
        System.out.println(toString() + " а еще могу фыркнуть.");
    }
}
