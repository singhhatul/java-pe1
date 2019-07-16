package com.stackroute.pe1;
import java.util.*;
public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter the number between 1 to 50 and 1 to 100");
        int  from = sc.nextInt();
        int to = sc.nextInt();
        int randomNumber = random.nextInt(to -from+1);
        int guessedNumber = 0;

        System.out.printf("The number is between %d and %d.\n", from, to);

        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = sc.nextInt();
            if (guessedNumber > randomNumber) {
                System.out.println("Your guess is too high!");
            }
            else if (guessedNumber < randomNumber) {
                System.out.println("Your guess is too low!");
            }
            else {
                System.out.println("You got it!");
            }
        } while (guessedNumber != randomNumber);
    }
}
