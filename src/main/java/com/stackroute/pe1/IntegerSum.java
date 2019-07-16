package com.stackroute.pe1;

import java.util.Scanner;

public class IntegerSum {
    public String  sumOfIntegerValue(String inputStringNumbers){
        String[] arrayOfStringNumber = inputStringNumbers.split(" ");
        boolean flag = true;
        int sum = 0;
        for (String str: arrayOfStringNumber) {
            for (int i = 0; i < str.length(); i++){
                if ( (!(Character.isDigit(str.charAt(i)))) &&
                        (str.charAt(i) != '-') &&
                        (str.charAt(i) != '+')){
                    flag = false;
                }

            }
        }
        if (flag){
            for (String str: arrayOfStringNumber){
                sum += Integer.parseInt(str);
            }
            return String.valueOf(sum);
        }
        else {
            return "Non Integer Value";
        }
    }

}




