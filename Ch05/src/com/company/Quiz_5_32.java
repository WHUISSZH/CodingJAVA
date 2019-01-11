package com.company;

import java.util.Scanner;

public class Quiz_5_32 {
    public void guessLottery(){
        int ten;
        int single;
        int lottery;

        do {
            lottery = (int)(10 + Math.random() * 90);
            ten = lottery / 10;
            single = lottery % 10;
        }while (ten == single);
        //int h = lottery /100;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick(two digits):");
        int guess = input.nextInt();
        if (guess >= 100 || guess <= 9){
            System.out.println("You must enter exactly two digits! Try again!\n");
            guessLottery();
            System.exit(1);
        }
        // int hOfguess = guess / 100;
        int tenOfguess = guess / 10;
        int singleOfguess = guess % 10;
        System.out.println("The lottery number is " + lottery);

        if(guess == lottery){
            System.out.print("Congratulations! you win 10000$");
        }else if(tenOfguess == single && singleOfguess == ten){
            System.out.print("Congratulations! you win 3000$");
        }else if(tenOfguess == ten
                || tenOfguess == single
                || singleOfguess == ten
                || singleOfguess == single){
            System.out.print("Congratulations! you win 1000");
        }else {
            System.out.print("Sorry, no match!");
        }
    }
}
