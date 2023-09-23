package ru.calculator;

public class MathFunc {


    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static int func3() {
        int res1 = MathFunc.func1(3);
        int res2 = MathFunc.func1(5);
        int result = res1 + res2;
        return result;
    }

    public static void main(String[] args) {

//        int res1 = MathFunc.func1(3);
//        int res2 = MathFunc.func1(5);
//        System.out.println(res1);
//        System.out.println(res2);
        int res1 = MathFunc.func3();
        System.out.println(res1);
    }
}