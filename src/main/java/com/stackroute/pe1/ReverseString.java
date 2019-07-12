package com.stackroute.pe1;

public class ReverseString {

   public String reverseAString(String str){
            String revStr="";
            int len= str.length();
            int i;
            //code to reverse string
            for (i = len- 1 ; i >= 0 ; i-- )
                revStr= revStr+ str.charAt(i);

            //return reversed string
            return revStr;
        }
    }
