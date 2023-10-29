package ru.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (i + 1) * (j + 1);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[][] res = multiple(9);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
