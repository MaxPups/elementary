package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean val = false;
        val = data[0];
        for (boolean value : data
        ) {
            if (val != value) {
                result = false;
                break;
            }
        }


        return result;
    }
}
