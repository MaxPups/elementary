package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * (percent/100);
            amount = amount - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        int res = year(200.0, 60, 20.0);
        System.out.println(res);
    }
}
