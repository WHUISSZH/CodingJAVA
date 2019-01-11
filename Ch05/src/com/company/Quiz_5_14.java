package com.company;

import java.util.Scanner;

public class Quiz_5_14 {
    public void computeMaxConventionNum(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.printf("Enter another integer: ");
        int num2 = input.nextInt();

        int min = Math.min(num1, num2);
        for (int k = min; k > 0; k--){
            if (num1 % k == 0 && num2 % k == 0){
                System.out.printf("The max number of convention is %d", k);
                System.exit(1);
            }
        }
    }
}
