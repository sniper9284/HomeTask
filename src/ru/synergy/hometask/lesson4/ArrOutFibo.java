package ru.synergy.hometask.lesson4;

import java.util.Scanner;

public class ArrOutFibo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 2;

        // бесконечный цикл с условием выхода
        while (true) {
            System.out.println("Введите номер числа Фибоначчи которое хотите узнать или exit для выхода: ");
            String inFibo = scanner.nextLine();
            int inFiboToINT = Integer.parseInt(inFibo);
            int[] arrayFibo = new int[inFiboToINT];
            arrayFibo[0] = 0; //первый элемент массива
            arrayFibo[1] = 1; //второй элемент массива
            if ("exit".equals(inFibo)) {
                break;
            } else {
                if (counter < inFiboToINT) {
                    for (int i = 2; i < inFiboToINT; ++i) {
                        arrayFibo[i] = arrayFibo[i - 1] + arrayFibo[i - 2];
                        counter = i;
                    }
                    System.out.println(arrayFibo[inFiboToINT - 1]);
                }
            }
        }
    }
}