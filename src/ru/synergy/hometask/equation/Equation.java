package ru.synergy.hometask.equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        // апрашиваем данные от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый коэффициент");
        double a;
        a = scanner.nextDouble();
        // если первый = 0, предупреждаем
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }
        System.out.println("Введите первый коэффициент");
        a = scanner.nextDouble();

        System.out.println("Введите второй коэффициент");
        double b = scanner.nextDouble();

        System.out.println("Введите третий коэффициент");
        double c = scanner.nextDouble();
        // если первый = 0, предупреждаем
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }
        //вычисляем дискриминант
        double d = b * b - 4 * a * c;
        //проверяем возможные решения
        if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
