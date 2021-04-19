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

        int[][] newmatrix = newMatrix.newArr(newMatrix.getM(), newMatrix.getN());
        int[][] newmatrix2 = newMatrix2.newArr(newMatrix2.getM(), newMatrix2.getN());
        System.out.println("Заполним матрицу элементами");

        System.out.println("вывод матрицы 1");
        newMatrix.outMatrix();
        defMatrix.outMatrixDef();

        System.out.println("вывод матрицы 2");
        newMatrix2.outMatrixDef();

        System.out.println("вывод произведения матриц");
        CreateMatrix multyMatrix = new CreateMatrix();
        multyMatrix.multyArrOut(newmatrix, newmatrix2);

        System.out.println("вывод суммы матриц");
        CreateMatrix summMatrix = new CreateMatrix();
        summMatrix.summArrOut(newmatrix, newmatrix2);

        System.out.println("вывод вычитания матриц");
        CreateMatrix difMatrix = new CreateMatrix();
        difMatrix.difArrOut(newmatrix, newmatrix2);
    }

}

