package com.stackroute.pe1;

import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string ");
        String s = sc.nextLine();
        int length = s.length();
        int i;
        for (i = 0; i < length; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.print(" vowel ");
                    break;
                default:
                    System.out.print(" consonant ");
            }
        }
    }
}