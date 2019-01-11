package com.company;

import java.util.Scanner;

public class Quiz_5_51 {
    void showMaxString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();
        System.out.print("Enter another string: ");
        String str2 = input.nextLine();
        int count = -1;
        int shorterStrLength = (str1.length() <= str2.length() ? str1.length() : str2.length());
        for (int i = 0; i <= shorterStrLength - 1; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                if (i == 0){
                    System.out.printf("%s and %s have no common prefix.", str1, str2);
                    System.exit(0);
                }else
                    break;
            }else
                count++;
        }
        System.out.print("The common prefix is: ");
        for (int i = 0; i <= count; i++){
            System.out.printf("%s", str1.charAt(i));
        }
    }
}
