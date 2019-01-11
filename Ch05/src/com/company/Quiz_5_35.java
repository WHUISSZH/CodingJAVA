package com.company;

import java.util.Scanner;

class Quiz_5_35 {
    void sum(){
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            sum += (double) 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.printf("The result is %f", sum);
    }
}
