package com.company;

import java.util.Scanner;

public class Quiz_5_29 {
    public void comuteInterest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money you save per month: ");
        double moneyPreMonth = input.nextDouble();
        System.out.print("Enter the save time(month): ");
        int month = input.nextInt();
        System.out.print("Enter the rate per year(%): ");
        double rate = input.nextDouble();
        double allMoney = 0;
        System.out.println("month\t\tall money");
        for (int i = 1; i <= month; i++){
            allMoney = (allMoney + moneyPreMonth) * (1 + rate / 1200);
            System.out.printf("%3d\t\t\t%.4f\n", i, allMoney);
        }
    }
}
