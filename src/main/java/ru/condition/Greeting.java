package ru.condition;

public class Greeting {

    public static void main(String[] args) {
//        String idea = "I like Java!";
//        System.out.println(idea);
//        idea += "But I am a newbie.";
//        int year = 2023;
//        idea += year;
//        System.out.println(idea);
        long l = 129;
        byte b = (byte) l; // потеря данных
//        System.out.println(b); -127

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i); // потеря данных
//        System.out.println(rsl); //-7197

        char c = 45000;
        float i2 = c; // без потери
//        System.out.println(i2); //45000.0


        double d = 121.19;
        byte b2 = (byte) d;// без потери
//        System.out.println(b2); //121

        short s1 = 1500;
        char c2 = (char) s1;
        double b3 = c2;// без потери
//        System.out.println(b3); //1500.0

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