package com.company;

import java.util.Scanner;

public class GfreatestCommonDivisor {
    public void computeCommon(){
        Scanner input = new Scanner(System.in);
        int gcd = 1;
       // int k = 2;
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

//        while (k <= num1 && k<= num2){
//            if (num1 % k == 0 && num2 % k == 0){
//                gcd = k;
//            }
//            k++;
//        }

        for (int k = 2; k <= num1 /2 && k <= num2 / 2; k++){
            if (num1 % k ==0 && num2 % k == 0)
                gcd = k;
        }
        System.out.printf("The greatest common divisor for %d and %d is %d", num1, num2, gcd);
    }

}
