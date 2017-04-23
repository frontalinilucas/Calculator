package com.lf.calculator.utils;

import android.util.Log;

public class Utils {

    public static boolean isNumber(String number){
        return number.matches(Constants.REGEX_NUMBER);
    }

    //TODO: borrar
    public static String formatNumber(String number){
       // number = replaceComma(number);
       // Log.i("123456789", "1: " + number);
        number = deleteZero(number);
        Log.i("123456789", "2: " + number);
      //  number = deleteMultiCommas(number);
      //  Log.i("123456789", "3: " + number);
      //  number = (number.isEmpty() ? Constants.ZERO : number);
      //  Log.i("123456789", "4: " + number);
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

    private static String deleteMultiCommas(String number) {
        return number.replace("..", Constants.POINT);
    }

}
