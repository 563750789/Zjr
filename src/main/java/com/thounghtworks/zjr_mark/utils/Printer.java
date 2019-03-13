package com.thounghtworks.zjr_mark.utils;

public class Printer {

    public static void print(String s) {

        System.out.println(s);
    }

    public static String timeParser(Integer a, Integer _b) throws NumberFormatException {

        if (a<0||_b<0){
            throw new NumberFormatException();
        }
        String b = (_b<10?"0"+Integer.toString(_b):Integer.toString(_b));
        return a<12?a+":"+b+"AM ":a-12+":"+b+"PM ";

    }
}
