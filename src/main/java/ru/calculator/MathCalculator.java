package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAndDivision(double first, double second) {
        return min(first, second)
                + division(first, second);
    }

    public static double sumAllMethods(double first, double second) {
        return division(first, second) + min(first, second) + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат всеч методов расчета равен: " + sumAllMethods(110, 20));
        System.out.println("Результат вычетания и деления равен: " + minAndDivision(101, 20));
    }
}
