package com.company;

import java.util.Scanner;

class Quiz_5_40 {
    void simulatedCoinToss(){
        int countUP = 0;
        int countDown = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the times of coin toss: ");
        int times = input.nextInt();
        for (int i = 1; i <= times; i++){
            double randomNum = Math.random();
            if (randomNum >= 0 && randomNum < 0.5){
                countUP++;
            }else
                countDown++;
        }
        System.out.print("\tup times\tdown times\tratio\n");
        System.out.printf("%10d%10d%15.10f", countUP, countDown, (double)countUP / countDown);
    }
}
