package ru.condition;

public class Max {

    public static int max(int left, int right) {

        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int res = max(19, 19);
        System.out.println(res);
    }
}