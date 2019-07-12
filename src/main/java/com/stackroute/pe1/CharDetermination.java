package com.stackroute.pe1;

import java.util.Scanner;

public class CharDetermination {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter input");

        char c= sc. next().charAt(0);
        if (c>=65 && c<=90){
            System.out.println("capital letter");
        }

        else if (c>=97 && c<=122){
            System.out.println("small letter");
        }

        else if (c>=47 && c<=57){
            System.out.println("digit ");
        }

        else if (c>=0 && c>=47 || c>=54 && c<=64 || c>=91 && c<=96
                || c>=123 && c<=127){
            System.out.println("special character");
        }
    }
}

