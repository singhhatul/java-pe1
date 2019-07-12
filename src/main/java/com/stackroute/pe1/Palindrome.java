package com.stackroute.pe1;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        long temp;
        long sum = 0;
        long evensum=0;
        long rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check");
        long num = sc.nextLong();
        temp = num;


        while (temp > 0) {
            rem = temp % 10;
            if(rem%2==0){
                evensum=evensum+rem;
            }
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }
        if (sum == num) {
            if(evensum>25){
                System.out.println(num + " is palindrome and the sum of even number is greater than 25");
            } else
                System.out.println(num + " is palindrome and the sum of even number is less than 25");
        }
        else
            System.out.println(num + "is not palindrome ");
    }
}