package com.company;

import java.util.Scanner;

class Quiz_5_19 {
    void printPattern(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();
        int count = 1;
        while (count <= lines){
            for (int i = 1; i <= 4 * (lines - count); i++){
                System.out.print(" ");
            }

            for (int i = 2; i <= count; i++){
                System.out.printf("%4d", (int)Math.pow(2, i - 2));
            }

            for (int i = count; i >= 1; i--){
                if (i == 1)
                System.out.printf("%4d\n", (int)Math.pow(2, i - 1));
                else
                    System.out.printf("%4d", (int)Math.pow(2, i - 1));
            }

            count++;
        }
    }
}
