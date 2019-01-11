package com.company;

import java.util.Scanner;

public class Quiz_5_30 {
    void printCalendar(){
        int count = 0;
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] monthDays = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day of 1st Jan: ");
        int initialDay = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            monthDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        for (int i = 1; i <= 12; i++){
            System.out.printf("\n\n\t\t\t\t\t%s %d\n", month[i - 1], year);
            System.out.print("--------------------------------------------\n");
            System.out.print("    Sun   Mon   Tue   Wed   Thu   Fri   Sat\n");

            for (int j = initialDay; j > 0; j--){
                System.out.print("      ");
                count++;
            }

            for (int d = 1; d <= monthDays[i]; d++){
                count++;
                if (count % 7 == 0){
                    System.out.printf("%6d\n", d);
                }else{
                    System.out.printf("%6d", d);
                }
            }

            initialDay = (initialDay + monthDays[i]) % 7;
            count = 0;
        }
    }
}
