package com.company;

import java.util.Scanner;

public class Dec2Hex {
    public void Dec2Hex() {
        Scanner input = new Scanner(System.in);
        String hex = "";
        System.out.print("Enter a decimal number: ");
        int dec = input.nextInt();
        int count = 0;
        while (dec != 0) {
            int hexValue = dec % 16;
            char hexCharValue = (hexValue >= 0 && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
            hex = hexCharValue + hex;
            dec /= 16;

            count++;
        }
        System.out.printf("The hex number is %s, time is %d", hex, count);
    }
}