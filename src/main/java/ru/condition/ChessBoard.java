package ru.condition;

public class ChessBoard {

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int res = way(1, 1, 5, 5);
        System.out.println(res);
        res = way(1, 1, 6, 6);
        System.out.println(res);
        res = way(2, 3, 6, 7);
        System.out.println(res);
    }

}
