package ru.synergy.hometask.lesson5.newmatrix;

import java.util.Scanner;

public class AddNewMatrix {
    public static void main(String[] args) {

        CreateMatrix defMatrix = new CreateMatrix(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы 1");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов матрицы 1");
        int n = scan.nextInt();

        CreateMatrix newMatrix = new CreateMatrix(m, n);
        newMatrix.setM(m);
        newMatrix.setN(n);

        CreateMatrix newMatrix2 = new CreateMatrix(m, n);
        newMatrix2.setM(m);
        newMatrix2.setN(n);

        int[][] newmatrix = newMatrix.newArr(m, n);
        int[][] newmatrix2 = newMatrix2.newArr(m, n);
        CreateMatrix multyMatrix = new CreateMatrix();
        System.out.println("Заполним матрицу элементами");

        System.out.println("вывод матрицы 1");
        newMatrix.outMatrix();
        defMatrix.outMatrixDef();

        System.out.println("вывод матрицы 2");
        newMatrix2.outMatrix();

        System.out.println("вывод произведения матриц");
        multyMatrix.multyArrOut(newmatrix, newmatrix2);
        multyMatrix.outMatrix();

        System.out.println("вывод суммы матриц");
        multyMatrix.summArrOut(newmatrix, newmatrix2);
        multyMatrix.outMatrix();

        System.out.println("вывод вычитания матриц");
        multyMatrix.difArrOut(newmatrix, newmatrix2);
        multyMatrix.outMatrix();

        System.out.println("вывод X2");
        multyMatrix.arrX2(newmatrix);
        multyMatrix.outMatrix();
    }

}

