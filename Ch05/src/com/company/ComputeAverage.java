package com.company;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class ComputeAverage {
    public void computeAve(){
        int count1 = 0;
        int count2 = 0;
        double sum = 0;
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        num = input.nextInt();

        //把if和P143的笔记结合起来看
        if (num == 0){
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        do {
            System.out.print("Enter an integer, the input ends if it is 0: ");
            num = input.nextInt();
            if (num < 0)
                count1++;
            else if (num > 0)
                count2++;
            sum += num;
        }
        while (num != 0);

        System.out.printf("The number of positives is %d\n", count1);
        System.out.printf("The number of negatives is %d\n", count2);
        System.out.printf("The total is %.1f\n", sum);
        System.out.printf("The average is %.2f\n", (sum / (count1 + count2)));
    }
}
