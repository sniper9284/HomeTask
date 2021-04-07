package ru.synergy.hometask.outsqrt;

import java.util.Scanner;

public class OutSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для извелечения корня");
        int usersqrt = scanner.nextInt();

        if (usersqrt % 2 == 0) {
            int outX;
            do {
                int x = usersqrt / 2;
                 outX = x * x;
            } while (outX < usersqrt);
            System.out.println(outX);
        }
    }

}
