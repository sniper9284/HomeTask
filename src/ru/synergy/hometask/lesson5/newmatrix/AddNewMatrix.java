package ru.synergy.hometask.lesson5.newmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewMatrix {
    public static void main(String[] args) {
        CreateMatrix defMatrix = new CreateMatrix(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int n = scan.nextInt();
        CreateMatrix newMatrix = new CreateMatrix(m, n);
        newMatrix.setM(m);
        newMatrix.setN(n);
        System.out.println("Заполним матрицу элементами");
        //вызвать сеттер матрицы
        newMatrix.setMatrix(newMatrix.getM(), newMatrix.getN());

        newMatrix.getMatrix();
        //System.out.println(Arrays.deepToString(newMatrix.getMatrix()));
        //System.out.println(Arrays.deepToString(defMatrix.getMatrix()));
    }
}
