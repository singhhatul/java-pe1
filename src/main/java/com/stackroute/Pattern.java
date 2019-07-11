package com.stackroute;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");

    int num = sc.nextInt();
    int i;
    int j;

    for(i=1;i<=num;i++)
    {
        for(j=0;j<i;j++){
            System.out.print(i +" ");
        }
    }

}
}
