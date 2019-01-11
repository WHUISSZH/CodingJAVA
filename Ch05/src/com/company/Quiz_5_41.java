package com.company;

import java.util.Scanner;

public class Quiz_5_41 {
    void maxNumCount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number, end with 0: ");
        int num = input.nextInt();
        int max = num;
        int count = 0;
        while (num != 0){
            num = input.nextInt();
            if (max >= num){
                count++;
            }else {
                max = num;
                count = 0;
            }
        }
        System.out.printf("The largest number is %d, the count is %d", max, count);
    }
}
