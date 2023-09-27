package ru.calculator;

public class MathFunc {


    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return  1 / x;
    }

    public static int func3() {
        int res1 = MathFunc.func1(3);
        int res2 = MathFunc.func1(5);
        return res1 + res2;
    }

    public static void main(String[] args) {


        int res1 = MathFunc.func3();
        System.out.println(res1);
    }
}
