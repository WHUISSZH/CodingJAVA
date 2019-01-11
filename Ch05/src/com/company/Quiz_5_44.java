package com.company;

import java.util.Scanner;

public class Quiz_5_44 {
    void show0x(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        System.out.print("The 16 bits are ");
        int mask = 1;
        for (int i = 15; i >= 0; i--) {
            int temp = value >> i;
            int bit = temp & mask;
            System.out.print(bit);
        }
    }
}
