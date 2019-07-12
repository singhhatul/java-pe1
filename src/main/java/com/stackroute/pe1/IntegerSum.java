package com.stackroute.pe1;

import java.util.Scanner;

public class IntegerSum {
        public static void main(String[] args) {
            int sum = 0;
            int num = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 when you want to exit");
            do {
                System.out.println("Enter the number");
                num = sc.nextInt();
                sum += num;
            } while (num != 0);
            System.out.println("Sum of the numbers is:" + sum);
        }

    }




