package ru.synergy.hometask.lesson7;

public class Treadmill {
    int d;

    public Treadmill() {
        int min = 1;
        int max = 100;
        this.d = min + (int) (Math.random() * max);
    }

    public int getD() {
        return d;
    }

    public String runT() {
        return " подпрыгнул на высоту " + d;
    }
}
