package com.company;

import java.util.Scanner;

public class Quiz_5_16 {
    public void computeFactor(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a integer: ");
        int num = input.nextInt();

        System.out.printf("The %d's factors are ", num);
        for (int k = 2; k <= num; ){
            if (num % k == 0){
                num /= k;
                System.out.printf(" %d", k);
            }else
                k++;
        }
    }
}
