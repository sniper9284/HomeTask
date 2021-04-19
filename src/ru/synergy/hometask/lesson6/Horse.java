package ru.synergy.hometask.lesson6;

public class Horse extends Animal {
    public Horse(String name, String say) {
        super(name, say);
    }

    @Override
    public void voice() {
        System.out.println(toString() + " а еще могу фыркнуть.");
    }
}
