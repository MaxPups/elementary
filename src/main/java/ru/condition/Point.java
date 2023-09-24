package ru.condition;

public class Point {

    static double distance(int x1, int y1, int x2, int y2) {
        double resX = x2 - x1;
        double resY = y2 - y1;
        resX = Math.pow(resX, 2);
        resY = Math.pow(resY, 2);
        double result = resX + resY;
        double rsl = Math.sqrt(result);
        return rsl;
    }

    public static void main(String[] args) {

        double result = distance(5, -5, -5, 10);
        System.out.println(result);

        result = distance(15, 15, -5, 100);
        System.out.println(result);

        result = distance(-40 , -100, 20, 22);
        System.out.println(result);

        result = distance(43, 29, -99, 26);
        System.out.println(result);


    }
}

