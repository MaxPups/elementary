package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = p * (p - a) * (p - b) * (p - c);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("area " + a + "," + b + "," + c + " = " + rsl);
        a = 3;
        b = 3;
        c = 3;
         rsl = TrgArea.area(a, b, c);
        System.out.println("area " + a + "," + b + "," + c + " = " + rsl);
    }
}