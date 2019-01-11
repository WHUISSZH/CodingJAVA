package com.company;

import java.util.Scanner;

public class Quiz_5_26 {
    public void computeE(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        double sum = 0;
        for (; num > 0; num -= 1){
            double n = 1;
            for (int i = num; i > 0; i -= 1){
                n *= i;
            }
            sum += 1 / n;
        }
        System.out.printf("The sum is %f", sum);
    }
}
