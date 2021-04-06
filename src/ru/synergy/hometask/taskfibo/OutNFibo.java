package ru.synergy.hometask.taskfibo;

import java.math.BigInteger;
import java.util.Scanner;

public class OutNFibo {
    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        System.out.println("Введите номер числа Фибоначчи которое хотите узнать");
        int nFibo = scaneer.nextInt();

        BigInteger aFibo = new BigInteger("0");
        BigInteger bFibo = new BigInteger("1");

        for (int i = 2; i <= nFibo; ++i) {
            BigInteger nextFibo = new BigInteger(String.valueOf(aFibo.add(bFibo)));
            aFibo = bFibo;
            bFibo = nextFibo;
        }
        System.out.println(bFibo);
    }
}
