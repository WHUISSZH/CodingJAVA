package com.company;

import java.util.Scanner;

public class Quiz_5_24 {
    public void computeSum(){
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 3; i <= num; i += 2){
            sum += (double)(i - 2) / i;
        }
        System.out.printf("The sum is %.8f", sum);
    }
}
