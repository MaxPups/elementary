package ru.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (true) {
            if(ivan>nik){
                break;
            }
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        int res = calc(10, 20);
        System.out.println(res);
    }

}

