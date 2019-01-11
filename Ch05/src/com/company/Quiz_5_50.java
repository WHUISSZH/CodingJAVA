package com.company;

import java.util.Scanner;

public class Quiz_5_50 {
    void capitalCount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.printf("The number of uppercase letters is %d", count);
    }
}
