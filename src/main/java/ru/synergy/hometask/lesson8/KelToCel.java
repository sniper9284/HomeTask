package ru.synergy.hometask.lesson8;

public class KelToCel implements Convertable {
    @Override
    public double convert(double result) {
        return result = result + 273.15;
    }
}
