package com.company;

import java.util.Scanner;

public class Quiz_5_21 {
    public void computeLoad(){
        final double MAX_INTEREST_RATE = 8;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loan = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double interestRate = 5;
        double monthlyPayment;
        double totalPayment;
        System.out.printf("Interest Rate    Monthly Payment       Total Payment\n");
        for (; interestRate <= MAX_INTEREST_RATE; interestRate *= 1.025){
            monthlyPayment = loan * interestRate * years / 1200;
            totalPayment = loan * interestRate * years / 100;
            System.out.printf("%8.3f%% %17.2f %20.2f\n", interestRate, monthlyPayment, totalPayment);
        }
    }
}
