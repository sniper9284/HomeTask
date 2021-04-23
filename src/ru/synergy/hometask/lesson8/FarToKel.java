package ru.synergy.hometask.lesson8;

public class FarToKel implements Convertable {
    @Override
    public double convert(double result) {
        return result = 5.0 / 9.0 * (result - 32.0) + 273.15;
    }
}
