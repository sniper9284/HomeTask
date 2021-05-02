package ru.synergy.hometask.lesson5;

import java.util.Scanner;

public class AddNewMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для умножения матрицы на него.");
        int number = scan.nextInt();
        System.out.println("Введите число для возведения матрицы в степень.");
        int stepNum = scan.nextInt();
        System.out.println("Введите числа m и n");
        int m = scan.nextInt();
        int n = scan.nextInt();

        //конструктор - по умолчанию 2 x 2
        CreateMatrix defMatrix1 = new CreateMatrix();
        CreateMatrix defMatrix2 = new CreateMatrix();
        //Заполняем матрицы
        newEnterMatrix(defMatrix1.getUserMatrix());
        newEnterMatrix(defMatrix2.getUserMatrix());
        System.out.println("Размер матрицы А: " + defMatrix1.getM() + " х " + defMatrix1.getN());
        defMatrix1.matrixOutPrint();
        System.out.println("Размер матрицы В: " + defMatrix2.getM() + " х " + defMatrix2.getN());
        defMatrix2.matrixOutPrint();

        //1. Сложение матриц
        System.out.println("Сумма матриц А и В:");
        CreateMatrix summaA = defMatrix1.matrixAdd(defMatrix2);
        summaA.matrixOutPrint();

        //2. Разность матриц
        System.out.println("Разность матриц А и В:");
        CreateMatrix deleteA = defMatrix1.matrixDel(defMatrix2);
        deleteA.matrixOutPrint();

        //3. Умножение матрицы на число
        System.out.println("Умножение матрицы А на число: " + number);
        CreateMatrix multiplicationNumberA1 = defMatrix1.matrixMultyNumber(number);
        multiplicationNumberA1.matrixOutPrint();
        System.out.println("Умножение матрицы B на число: " + number);
        CreateMatrix multiplicationNumberA2 = defMatrix2.matrixMultyNumber(number);
        multiplicationNumberA2.matrixOutPrint();

        //4. Умножение матриц
        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            CreateMatrix matrixMultiplicationA = defMatrix1.matrixMulty(defMatrix2);
            matrixMultiplicationA.matrixOutPrint();
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + defMatrix1.getM() + " не равно числу строк матрицы B: " + defMatrix2.getN());
        }

        //5. Возведение матриц в степень
        System.out.println("Возведение в степень " + stepNum + " матрицы А:");
        CreateMatrix matrixSquaringA1 = defMatrix1.matrixSqua(stepNum);
        matrixSquaringA1.matrixOutPrint();
        System.out.println("Возведение в степень " + stepNum + " матрицы В:");
        CreateMatrix matrixSquaringA2 = defMatrix2.matrixSqua(stepNum);
        matrixSquaringA2.matrixOutPrint();

        //6. Вычисление определителя 2х2
        System.out.println("Вычисление определителя матрицы А - 2х2");
        System.out.println(defMatrix1.matrixDeterminant());
        System.out.println("Вычисление определителя матрицы B - 2х2");
        System.out.println(defMatrix2.matrixDeterminant());

        //конструктор перегруженный. m и n запрашиваем у пользователя.
        CreateMatrix mB1 = new CreateMatrix(m, n);
        CreateMatrix mB2 = new CreateMatrix(m, n);
        //Заполняем матрицы
        newEnterMatrix(mB1.getUserMatrix());
        newEnterMatrix(mB2.getUserMatrix());
        System.out.println("Размер матрицы А: " + mB1.getM() + " х " + mB1.getN());
        mB1.matrixOutPrint();
        System.out.println("Размер матрицы В: " + mB2.getM() + " х " + mB2.getN());
        mB2.matrixOutPrint();

        //1. Сложение матриц
        System.out.println("Сумма матриц А и В:");
        CreateMatrix summaB = mB1.matrixAdd(mB2);
        summaB.matrixOutPrint();

        //2. Разность матриц
        System.out.println("Разность матриц А и В:");
        CreateMatrix deleteB = mB1.matrixDel(mB2);
        deleteB.matrixOutPrint();

        //3. Умножение матрицы на число
        System.out.println("Умножение матрицы А на число: " + number);
        CreateMatrix multiplicationNumberB1 = mB1.matrixMultyNumber(number);
        multiplicationNumberB1.matrixOutPrint();
        System.out.println("Умножение матрицы B на число: " + number);
        CreateMatrix multiplicationNumberB2 = mB2.matrixMultyNumber(number);
        multiplicationNumberB2.matrixOutPrint();

        //4. Умножение матриц
        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            CreateMatrix matrixMultiplicationB = mB1.matrixMulty(mB2);
            matrixMultiplicationB.matrixOutPrint();
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + mB1.getM() + " не равно числу строк матрицы B: " + mB2.getN());
        }

        //5. Возведение матриц в степень
        System.out.println("Возведение в степень " + stepNum + " матрицы А:");
        CreateMatrix matrixSquaringB1 = mB1.matrixSqua(stepNum);
        matrixSquaringB1.matrixOutPrint();
        System.out.println("Возведение в степень " + stepNum + " матрицы В:");
        CreateMatrix matrixSquaringB2 = mB2.matrixSqua(stepNum);
        matrixSquaringB2.matrixOutPrint();

        //6. Вычисление определителя 3х3
        System.out.println("Вычисление определителя матрицы А - 3х3");
        System.out.println(mB1.matrixDeterminant());
        System.out.println("Вычисление определителя матрицы B - 3х3");
        System.out.println(mB2.matrixDeterminant());
        //7. Возврат единичной матрицы (через статичное поле и метод)
        System.out.println("Возврат единичной матрицы (через статичное поле и метод)");
        CreateMatrix matrixUnit = CreateMatrix.getMatrixUnit();
        matrixUnit.matrixOutPrint();

    }

    //Рандомное заполнение матрицы от 0 до 10
    public static int[][] newEnterMatrix(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = (int) (Math.random() * 10);
            }
        }
        return input;
    }
}

