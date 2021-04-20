package ru.synergy.hometask.lesson5.newmatrix;

public class CreateMatrix {
    private int m;
    private int n;
    private int[][] matrix;

    public CreateMatrix(int defMN) {
        this.matrix = new int[defMN][defMN];
    }

    public CreateMatrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }

    public CreateMatrix() {
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int[][] newArr(int a, int b) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public int[][] newArrDef(int defMN) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public void outMatrix() {
        int[][] arr = newArr(getM(), getN());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void outMatrixDef() {
        int[][] arrDef = newArrDef(2);
        for (int i = 0; i < arrDef.length; i++) {
            for (int j = 0; j < arrDef[i].length; j++) {
                System.out.print(" " + arrDef[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multyArrOut(int[][] newmatrix, int[][] newmatrix2) {
        int[][] multyArr = new int[newmatrix.length][newmatrix2[0].length];
        for (int i = 0; i < multyArr[0].length; i++)
            for (int j = 0; j < multyArr.length; j++)
                for (int k = 0; k < newmatrix[0].length; k++)
                    multyArr[i][j] = multyArr[i][j] + (newmatrix[i][k] * newmatrix2[k][j]);
        for (int i = 0; i < multyArr.length; i++) {
            for (int j = 0; j < multyArr[0].length; j++) {
                System.out.print(" " + multyArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void summArrOut(int[][] newmatrix, int[][] newmatrix2) {
        int[][] summArr = new int[newmatrix.length][newmatrix2[0].length];
        for (int i = 0; i < summArr[0].length; i++)
            for (int j = 0; j < summArr.length; j++)
                for (int k = 0; k < newmatrix[0].length; k++)
                    summArr[i][j] = summArr[i][j] + (newmatrix[i][k] + newmatrix2[k][j]);
        for (int i = 0; i < summArr.length; i++) {
            for (int j = 0; j < summArr[0].length; j++) {
                System.out.print(" " + summArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void difArrOut(int[][] newmatrix, int[][] newmatrix2) {
        int[][] summArr = new int[newmatrix.length][newmatrix2[0].length];
        for (int i = 0; i < summArr[0].length; i++)
            for (int j = 0; j < summArr.length; j++)
                for (int k = 0; k < newmatrix[0].length; k++)
                    summArr[i][j] = summArr[i][j] + (newmatrix[i][k] - newmatrix2[k][j]);
        for (int i = 0; i < summArr.length; i++) {
            for (int j = 0; j < summArr[0].length; j++) {
                System.out.print(" " + summArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void arrX2 (int [][] CreateMatrix) {
        int[][] arrX2 = CreateMatrix;
        for (int i=0; i < arrX2[0].length; i++) {
            for (int j = 0; j < arrX2.length; j++) {
                arrX2[i][j] = arrX2[i][j] + (arrX2[i][j] ^ 2);
            }
        }
        for (int i = 0; i < arrX2.length; i++) {
            for (int j = 0; j < arrX2[0].length; j++) {
                System.out.print(" " + arrX2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
