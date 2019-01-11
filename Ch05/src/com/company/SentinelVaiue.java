package com.company;

import java.util.Scanner;

public class SentinelVaiue {
    public void sentinelValue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        while (num != 0){
            sum += num;
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        System.out.printf("The addition is %d", sum);
    }
}
