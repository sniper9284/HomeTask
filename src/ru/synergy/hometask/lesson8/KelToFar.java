package ru.synergy.hometask.lesson8;

public class KelToFar implements Convertable {
    @Override
    public double convert(double result) {
        return result = 9.0 / 5.0 * (result - 273.15) + 32.0;
    }
}
