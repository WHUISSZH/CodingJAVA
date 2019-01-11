package com.company;

import java.util.Scanner;

class Quiz_5_39 {
    void computeCommission(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission you want to make: ");
        double commission = input.nextDouble();
        double minSales;
        if (commission >= 0.01 * 0.08 && commission <= 5000 * 0.08){
            minSales = commission / 0.08;
        }else if (commission <= 10000 * 0.08){
            minSales = 5000 + (commission - 5000 * 0.08) / 0.1;
        }else
            minSales = 10000 + (commission - 5000 * 0.08 - 5000 * 0.1) / 0.12;
        System.out.printf("If you want to make %.2f$, your sales should have %.2f$ at least", commission, minSales);
    }
}
