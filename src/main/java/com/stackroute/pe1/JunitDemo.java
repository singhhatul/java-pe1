package com.stackroute.pe1;

public class JunitDemo {
    public String concatAndUpperCase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return ("null value not allowed");
        }
        String concatcatedString = str1.concat(str2);
        return concatcatedString.toUpperCase();
    }

    public String reverseString(String str) {
        String temp = "";
        try {
            int len = str.length();

            for (int i = len - 1; i >= 0; i--) {
                temp = temp + str.charAt(i);
            }

        } catch (Exception e) {
           return "NullPointerException Caught";
        }
        return temp;
    }
}
