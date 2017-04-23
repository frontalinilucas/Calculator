package com.lf.calculator.utils;


public class Utils {

    public static boolean isNumber(String number){
        return number.matches(Constants.REGEX_NUMBER);
    }

    //TODO: borrar
    public static String formatNumber(String number){
        number = deleteZero(number);
        return number;
    }

    public static String replaceComma(String number) {
        return (!number.contains(Constants.POINT)
                ? number.replace(Constants.COMMA, Constants.POINT)
                : number.replace(Constants.COMMA, Constants.EMPTY));
    }

    private static String deleteZero(String number) {
        return (number.matches("0[0-9]+") ? number.substring(1, number.length()) : number);
    }

}
