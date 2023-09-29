package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        String gender = "WOMAN";
        short height = 150;
        double woman = womanWeight(height);
        System.out.println(gender + " " + height + " is " + woman + " weight");

        gender = "MAN";
        height = 180;
        double men = manWeight(height);
        System.out.println(gender + " " + height + " is " + men + " weight");

        gender = "MAN";
        height = 200;
        men = manWeight(height);
        System.out.println(gender + " " + height + " is " + men + " weight");

        gender = "WOMAN";
        height = 175;
        woman = womanWeight(height);
        System.out.println(gender + " " + height + " is " + woman + " weight");
    }

}
