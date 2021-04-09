package ru.synergy.hometask.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrOutFibo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ArrayList так как массив нам нужен динамический.
        ArrayList<Integer> arrayFibo = new ArrayList<>();
        arrayFibo.add(0); //первый элемент массива
        arrayFibo.add(1); //второй элемент массива
        int counter = 2;

        // бесконечный цикл с условием выхода
        while (true) {
            System.out.println("Введите номер числа Фибоначчи которое хотите узнать или exit для выхода: ");
            System.out.println("Введите fibo для просмотра текущих значений массива"); // для проверки, что все хранится в массиве
            String inFibo = scanner.nextLine();
            if ("exit".equals(inFibo)) {
                break;
            } else if ("fibo".equals(inFibo)) {
                System.out.println(arrayFibo);
            } else {
                int inFiboToINT = Integer.parseInt(inFibo);
                if (counter < inFiboToINT) {
                    for (int i = counter; i < inFiboToINT; ++i) {
                        int elem = arrayFibo.get(i - 1) + arrayFibo.get(i - 2);
                        arrayFibo.add(elem);
                    }
                    counter = inFiboToINT;
                    System.out.println(arrayFibo.get(inFiboToINT - 1));
                } else {
                    System.out.println(arrayFibo.get(inFiboToINT - 1));
                }
            }
        }
    }
}