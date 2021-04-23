package ru.synergy.hometask.lesson8;

public class CelToFar implements Convertable {

    @Override
    public double convert(double result) {
        return result = 9.0 / 5.0 * result + 32.0;
    }
}
