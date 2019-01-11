package com.company;

import java.util.Scanner;

public class Quiz_5_47 {
    void computeISBN_13(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN_12 = input.next();
        int sum = 0;
        int d13 = 0;

        if (ISBN_12.length() != 12){
            System.out.printf("%s is an invalid input, you must enter exactly 12 digits!", ISBN_12);
            System.exit(0);
        }

        for (int i = 0; i <=  ISBN_12.length() - 1; i++){
            if ((i + 1) % 2 == 0){
                sum += 3 * (ISBN_12.charAt(i) - 48);
            }else
                sum += ISBN_12.charAt(i) - 48;
        }

        if ( 10 - sum % 10 != 10){
            d13 = 10 - sum % 10;
        }
        System.out.printf("The ISBN-13 number is: %s", ISBN_12 + d13);
    }
}
