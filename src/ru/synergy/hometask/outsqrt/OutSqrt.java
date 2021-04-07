package ru.synergy.hometask.outsqrt;

import java.util.Scanner;

public class OutSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для извелечения корня");
        int usersqrt = scanner.nextInt();

        System.out.println(outSqrt(usersqrt));
    }
    public static int outSqrt(int n) {
        int a = 1;
        int b = n + 1;
        int mid, val, i;

        while (b - a > 1) {
            mid = (a + b) / 2;
            val = n;
            for (i = 1; i <= 2 - 1; ++i) {
                val /= mid;
                if (val >= mid) {
                    a = mid;
                } else b = mid;
            }
        }
        return a;
    }
}
