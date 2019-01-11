package com.company;

public class Quiz_5_27 {
    public void showYears(){
        int year = 101;
        int count = 0;
        while (year <= 2100){
            boolean isYear = false;
            if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0){
                isYear = true;
            }
            if (isYear){
                count++;
                if (count % 10 == 0){
                    System.out.printf("%5d\n", year);
                }else
                    System.out.printf("%5d", year);
            }
            year++;
        }

//        for (; year <= 2100; year++){
//            boolean isYear = false;
//            if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0){
//                isYear = true;
//            }
//            if (isYear){
//                count++;
//                if (count % 10 == 0){
//                    System.out.printf("%5d\n", year);
//                }else
//                    System.out.printf("%5d", year);
//            }
//        }
    }
}

