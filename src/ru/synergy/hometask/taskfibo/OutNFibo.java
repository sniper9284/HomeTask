package ru.synergy.hometask.taskfibo;

import java.math.BigInteger;
import java.util.Scanner;

public class OutNFibo {
    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        System.out.println("Введите номер числа Фибоначчи которое хотите узнать");
        BigInteger nFibo = new BigInteger(scaneer.nextLine());

        System.out.println(getFibonacci(nFibo));
    }

    // функция рекурсии для поиска
    //
    // не уверен в 100% правильности данной функции с числами BigInteger
    //
    //
    public static int getFibonacci(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return 0;
        } else if (n.equals(BigInteger.ONE)) {
            return 1;
        }else if (n.equals(BigInteger.TWO)) {
            return 1;
        } else  {
            return getFibonacci(n.subtract(BigInteger.ONE)) + getFibonacci(n.subtract(BigInteger.TWO));
        }
    }
}
