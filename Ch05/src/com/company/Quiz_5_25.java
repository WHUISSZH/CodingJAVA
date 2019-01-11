package com.company;

import java.util.Scanner;

public class Quiz_5_25 {
    public void computePI(){
        double PI = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (; num > 0; num -= 1){
            PI += 4 * Math.pow(-1, num + 1) / (double)(2 * num - 1);
        }
        System.out.printf("PI is %.20f", PI);
    }
}
