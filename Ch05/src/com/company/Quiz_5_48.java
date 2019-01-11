package com.company;

import java.util.Scanner;

public class Quiz_5_48 {
        void showOddChart(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = input.next();

            for (int i = 0; i <= str.length() - 1; i++){
                if ((i + 1) % 2 != 0){
                    System.out.printf("%s", str.charAt(i));
                }
            }
        }

}
