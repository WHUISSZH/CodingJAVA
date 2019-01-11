package com.company;

import java.util.Scanner;

public class Quiz_5_38 {
    void D2E(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a d number: ");
        int dNum = input.nextInt();
        String bNum = "";
        do {
            bNum = dNum % 8 + bNum;
            dNum /= 8;
        }while (dNum != 0);
        System.out.printf("The result is %s", bNum);
    }
}
