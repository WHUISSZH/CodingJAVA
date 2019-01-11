package com.company;

import java.util.Scanner;

class Quiz_5_37 {
    void D2B(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a d number: ");
        int dNum = input.nextInt();
        String bNum = "";
        do {
            bNum = dNum % 2 + bNum;
            dNum /= 2;
        }while (dNum != 0);
        System.out.printf("The result is %s", bNum);
    }
}
