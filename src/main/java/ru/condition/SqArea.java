package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        int p = 4;
        int k = 1;

        double result1 = SqArea.square(6, 2);
        System.out.println( " real = " + result1);

    }
}
