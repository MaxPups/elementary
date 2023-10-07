package ru.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
