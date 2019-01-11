package com.company;

import java.util.Scanner;

 class Quiz_5_28 {
     void showMonday(){
        int initialDay = 0;
        int monthDays = 0;
        int resultDay;
        String[] month =
                {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "June",
                "July",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
                };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the day of 1st Jan: ");
        String weekday = input.next();

        switch (weekday){
            case "Sun":
                initialDay = 0;
                break;
            case "Mon":
                initialDay = 1;
                break;
            case "Tues":
                initialDay = 2;
                break;
            case "Wed":
                initialDay = 3;
                break;
            case "Thur":
                initialDay = 4;
                break;
            case "Fir":
                initialDay = 5;
                break;
            case "Sta":
                initialDay = 6;
        }

        for (int i = 0; i <= 11; i++){
            switch (month[i]){
                case "Jan":
                    monthDays = 0;
                    break;
                case "Feb":
                    monthDays = 31;
                    break;
                case "Mar":
                    monthDays = 31 + 28;
                    break;
                case "Apr":
                    monthDays = 31 + 28 + 31;
                    break;
                case "May":
                    monthDays = 31 + 28 + 31 + 30;
                    break;
                case "June":
                    monthDays = 31 + 28 + 31 + 30 + 31;
                    break;
                case "July":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30;
                    break;
                case "Aug":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                    break;
                case "Spe":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case "Oco":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case "Dec":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                case "Nve":
                    monthDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            }

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                if (i == 0){
                    resultDay = (initialDay + monthDays) % 7;
                }else{
                    resultDay = (initialDay + monthDays + 1) % 7;
                }
            }else {
                resultDay = (initialDay + monthDays) % 7;
            }

            switch (resultDay){
                case 0:
                    weekday = "Sun";
                    break;
                case 1:
                    weekday = "Mon";
                    break;
                case 2:
                    weekday = "Tues";
                    break;
                case 3:
                    weekday = "Wen";
                    break;
                case 4:
                    weekday = "Thur";
                    break;
                case 5:
                    weekday = "Fri";
                    break;
                case 6:
                    weekday = "Sta";
            }
            System.out.printf("%s 1, %d is %s\n", month[i], year, weekday);
        }
    }

    void showMonday2(){
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int numberOfDaysInMonth = 0;

        // Display calendar for each month
        for (int month = 1; month <= 12; month++) {
            // Display Calendar title
            switch (month) {
                case 1: System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 2: System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    break;
                case 3: System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 4: System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 5: System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 6: System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 7: System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 8: System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 9: System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 10: System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
                case 11: System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    break;
                case 12: System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    break;
            }

            switch (firstDay) {
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
            }

            // Get the start day for the next month
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }
}