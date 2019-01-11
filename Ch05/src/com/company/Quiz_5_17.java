package com.company;

import java.util.Scanner;

public class Quiz_5_17 {
    public void printNumTable(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of lines: ");
        int lines = input.nextInt();
        int count = 1;

        while (count <= lines){
            for (int i = 1; i <= 3 * (lines - count); i++)
                System.out.printf(" ");
            //打印一行
            {
                for (int i = count; i >= 2; i--){
                    System.out.printf("%3d", i);
                }

                for (int i = 1; i <= count; i++) {
                    if (i == count)
                        System.out.printf("%3d\n", i);
                    else
                        System.out.printf("%3d", i);
                }
            }
            count++;
        }
    }
}
