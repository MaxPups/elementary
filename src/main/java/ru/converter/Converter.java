package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static float euroToRubles(float value) {
        float rsl = value * 100;
        return rsl;
    }

    public static float dollarToRubles(float value) {
        float rsl = value * 90;
        return rsl;
    }


    public static String getStringResult(float first, float second, String name) {
        return first + " it is " + second + " " + name;
    }


    public static void main(String[] args) {
        float rub = 300f;
        float resConvertRub = rubleToDollar(rub);
        String result = getStringResult(rub, resConvertRub, "Dollar");
        System.out.println(result);

        rub = 650f;
        resConvertRub = rubleToEuro(rub);
        result = getStringResult(rub, resConvertRub, "Euro");
        System.out.println(result);

        float euro = 10.5f;
        float resConvertEuro = euroToRubles(euro);
        result = getStringResult(euro, resConvertEuro, "Rubles");
        System.out.println(result);

        float dollar = 20.8f;
        float resConvertDollar = dollarToRubles(dollar);
        result = getStringResult(dollar, resConvertDollar, "Rubles");
        System.out.println(result);
    }

}
