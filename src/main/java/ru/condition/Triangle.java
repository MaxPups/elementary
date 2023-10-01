package ru.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main (String[] args){
        boolean res = exist(4,6,3);
        System.out.println(res);
    }
}
