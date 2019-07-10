package com.stackroute;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if((num > 20) && (num < 30)){
            if(num % 2 != 0){
                System.out.println("TOM");
            }else
                System.out.println("JERRY");

        }else
            System.out.println("number is not between 20 and 30");
    }
}