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

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setMatrix(int m, int n) {
        for (int i=0;i < m;++i){
            for (int j=0;j < n;++j){
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
        this.matrix  = new int[m][n];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }
}
