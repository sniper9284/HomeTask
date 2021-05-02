package ru.synergy.hometask.lesson8;

public class FarToCel implements Convertable {
    @Override
    public double convert(double result) {
        return result = 5.0 / 9.0 * (result - 32.0);
    }
}
