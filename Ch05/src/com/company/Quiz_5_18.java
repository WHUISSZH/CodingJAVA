package com.company;

import java.util.Scanner;

public class Quiz_5_18 {
    public void printPattern(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of the lines: ");
        int lines = input.nextInt();
        int count = 1;

        while (count <= lines){
            for (int i = 1; i <= 3 * (count - 1); i++){
                System.out.printf(" ");
            }

            for (int i = 1; i <= lines - count + 1; i++){
                if (i == lines - count + 1)
                System.out.printf("%3d\n", i);
                else
                    System.out.printf("%3d", i);
            }
            count++;
        }
    }
}
