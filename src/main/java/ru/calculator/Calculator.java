package ru.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six/two;
        int fiveMinusTwo = five-two;
        int fourTimeTwo = four*two;

//        System.out.println(sixDivTwo);
//        System.out.println(fiveMinusTwo);
//        System.out.println(fourTimeTwo);

//        int res1 = Calculator.plus(1, 2);
//        int res2 =  Calculator.plus(10, 11);


        // exec method func1 from task
        int res3 = Calculator.func1(1000);
        System.out.println(res3);

    }
    public static int plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
        return result;
    }

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

}
