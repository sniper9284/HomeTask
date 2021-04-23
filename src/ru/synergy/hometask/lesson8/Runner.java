package ru.synergy.hometask.lesson8;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        double result;

        Scanner scan = new Scanner(System.in);

        Convertable celToFar = new CelToFar();
        Convertable farToCel = new FarToCel();

        Convertable celToKel = new CelToKel();
        Convertable kelToCel = new KelToCel();

        Convertable farToKel = new FarToKel();
        Convertable kelToFar = new KelToFar();

        while (true) {
            System.out.println("Выберите вариант конвертации");
            System.out.println("1 = Цельсий в Фарингейт");
            System.out.println("2 = Фаренгейт в Цельсий");
            System.out.println("3 = Цельсий в Кельвин");
            System.out.println("4 = Кельвин в Цельсий");
            System.out.println("5 = Фаренгейт в Кельвин");
            System.out.println("6 = Кельвин в Фаренгейт");
            System.out.println("7 = Выход из программы.");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Ведите число");
                    result = celToFar.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Ведите число");
                    result = farToCel.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Ведите число");
                    result = celToKel.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Ведите число");
                    result = kelToCel.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 5:
                    System.out.println("Ведите число");
                    result = farToKel.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 6:
                    System.out.println("Ведите число");
                    result = kelToFar.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
