package com.stackroute.pe1;
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        {
            //declaring string objects
            String str="";
            String revStr="";

            Scanner in = new Scanner(System.in);

            //input string
            System.out.print("Enter a string :");
            str= in.nextLine();

            //get length of the input string
            int len= str.length();

            //code to reverse string
            for ( int i = len- 1 ; i >= 0 ; i-- )
                revStr= revStr+ str.charAt(i);

            //print reversed string
            System.out.println("Reverse String is: "+revStr);
        }
    }
}
