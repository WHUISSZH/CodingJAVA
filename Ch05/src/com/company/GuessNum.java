package com.company;

import java.util.Scanner;

public class GuessNum {
    public void guessNum(){
        int num = (int)(Math.random() * 100 + 1);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 to 100");

        int guess = -1;
        while (guess != num){
            System.out.print("\nEnter you guess: ");
            guess = input.nextInt();

            if (guess == num){
                System.out.printf("Yes, the number is %d", num);
            }else if (guess >= num){
                System.out.print("Your guess is higher");
            }else if (guess <= num){
               System.out.print("Your guess is lower");
            }
        }
    }

}
