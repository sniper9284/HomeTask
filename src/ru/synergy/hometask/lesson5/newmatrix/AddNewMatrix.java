package ru.synergy.hometask.lesson5.newmatrix;

import java.util.Scanner;

public class AddNewMatrix {
    public static void main(String[] args) {
        CreateMatrix newMatrix = new CreateMatrix();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        newMatrix.setM(scan.nextInt());
        System.out.println("Введите количество столбцов матрицы");
        newMatrix.setN(scan.nextInt());
        System.out.println("Заполним матрицу элементами");
        int m = newMatrix.getM();
        int n = newMatrix.getN();
        //вызвать сеттер матрицы

        System.out.println(newMatrix.getN());
        System.out.println(newMatrix.getM());
        //вызвать геттер матрицы
    }
}
