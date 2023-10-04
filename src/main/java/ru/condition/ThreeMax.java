package ru.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (first == third || second == third) {
            result = third;
        }
        if (first == second) {
            result = first;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = max(10, 9, 8);
        System.out.println(res);
    }

}
