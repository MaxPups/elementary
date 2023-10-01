package ru.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = -10;
        boolean res = notPositive(num);
        System.out.println(res);

        num = 1;
        res = notEvenAndPositive(num);
        System.out.println(res);

        num = 3;
        res = notEvenAndPositive(num);
        System.out.println(res);

        num = 2;
        res = evenOrNotPositive(num);
        System.out.println(res);

    }
}
