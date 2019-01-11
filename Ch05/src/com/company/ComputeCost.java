package com.company;

import java.util.Scanner;

 class ComputeCost {
     void computeCost(){
         Scanner input = new Scanner(System.in);
        double price;
        double performsAmount;
        double allAmount = 0;
        double averageCost;
        double allCost = 0;
        int count = 0;
        System.out.print("Enter the number of transaction: ");
        int numOfTransaction = input.nextInt();
        Cost[] cost = new Cost[numOfTransaction];

        do {
            cost[count] = new Cost();
            System.out.print("Enter the price: ");
            price = input.nextDouble();
            cost[count].setPrice(price);

            System.out.print("Enter the amount: ");
            performsAmount = input.nextDouble();
            cost[count].setAmount(performsAmount);

            allAmount += performsAmount;
            allCost += price * performsAmount;
            count++;
        }while (count < numOfTransaction);

        averageCost = allCost / allAmount;
        System.out.printf(" price\t\t amount\t\t cost($)\n");

        for (int i = 0; i < count; i++){
            System.out.printf("%-12.4f%-12.4f%-12.4f\n",
                    cost[i].getPrice(), cost[i].getAmount(), cost[i].getPrice() * cost[i].getAmount());
        }
        System.out.printf("all amount: %.4f\tall cost: %.4f\naverage cost: %.4f $", allAmount, allCost, averageCost);
    }
}
