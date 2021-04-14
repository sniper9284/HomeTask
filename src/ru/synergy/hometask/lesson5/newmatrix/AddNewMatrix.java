package ru.synergy.hometask.lesson5.newmatrix;

import java.util.Scanner;

public class AddNewMatrix {
    public static void main(String[] args) {
        int m, n;

        CreateMatrix defMatrix = new CreateMatrix(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы 1");
        m = scan.nextInt();
        System.out.println("Введите количество столбцов матрицы 1");
        n = scan.nextInt();

        CreateMatrix newMatrix = new CreateMatrix(m, n);
        newMatrix.setM(m);
        newMatrix.setN(n);
        int[][] arr = newMatrix.newArr(newMatrix.getM(), newMatrix.getN());

        System.out.println("Введите количество строк матрицы 2");
        m = scan.nextInt();
        System.out.println("Введите количество столбцов матрицы 2");
        n = scan.nextInt();

        CreateMatrix newMatrix2 = new CreateMatrix(m, n);
        newMatrix2.setM(m);
        newMatrix2.setN(n);
        int[][] arr2 = newMatrix2.newArr(newMatrix2.getM(), newMatrix2.getN());

        System.out.println("Заполним матрицу элементами");

        System.out.println("вывод матрицы 1");
        newMatrix.outMatrix();
        System.out.println("вывод матрицы 2");
        newMatrix2.outMatrixDef();
        System.out.println("вывод произведения матриц");
        int[][] multyArr = new int[arr.length][arr2[0].length];
        for (int i = 0; i < multyArr[0].length; i++)
            for (int j = 0; j < multyArr.length; j++)
                for (int k = 0; k < arr[0].length; k++)
                    multyArr[i][j] = multyArr[i][j] + arr[i][k] * arr2[k][j];
        for (int i = 0; i < multyArr.length; i++) {
            for (int j = 0; j < multyArr[0].length; j++) {
                System.out.print(" " + multyArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("вывод суммы матриц");
        int[][] summArr = new int[arr.length][arr2[0].length];
        for (int i = 0; i < summArr[0].length; i++)
            for (int j = 0; j < summArr.length; j++)
                for (int k = 0; k < arr[0].length; k++)
                    summArr[i][j] = summArr[i][j] + (arr[i][k] + arr2[k][j]);
        for (int i = 0; i < summArr.length; i++) {
            for (int j = 0; j < summArr[0].length; j++) {
                System.out.print(" " + summArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

