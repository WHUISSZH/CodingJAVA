package com.company;

import java.util.Scanner;

public class Quiz_5_23 {
    public void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = input.nextDouble();
        double sum = 0;
        for (; num >= 1; num -= 1){
            sum += (1 / num);
        }
        System.out.printf("The sum is %f", sum);
    }
}
