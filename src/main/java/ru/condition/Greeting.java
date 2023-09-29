package ru.condition;

public class Greeting {

    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        char c = 45000;
        float i2 = c;
        double d = 121.19;
        byte b2 = (byte) d;
        short s1 = 1500;
        char c2 = (char) s1;

        double b3 = c2;
        int first = 2;
        int second = 10;
        first += second;
        System.out.println("Result sum: " + first);
        first = 2;
        second -= first;
        System.out.println("Result subtract: " + second);
        second = 10;
        first *= second;
        System.out.println("Result multiply: " + first);
        first = 2;
        second /= first;
        System.out.println("Result divide: " + second);

    }
}