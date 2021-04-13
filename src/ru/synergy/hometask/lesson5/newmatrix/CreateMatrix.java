package ru.synergy.hometask.lesson5.newmatrix;

import java.util.Random;

public class CreateMatrix {
    int m;
    int n;
    int[][] matrix = new int[m][n];

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setMatrix(int[][] matrix) {
        for (int i=0;i < matrix.length;++i){
            for (int j=0;j < matrix[i].length;++j){
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
        this.matrix = matrix;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int[][] getMatrix() {
        for (int i=0;i < matrix.length;i++,System.out.println()){
            for (int j=0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        return matrix;
    }
}
