package com.company;

import java.util.Scanner;

public class Quiz_5_49 {
    void count(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int count = 0;
        int spaceCount = 0;

        for (int i = 0; i <= str.length() - 1; i++){
            switch (str.charAt(i)){
                case 'A':
                case 'a':
                    count++;
                    break;
                case 'E':
                case 'e':
                    count++;
                    break;
                case 'I':
                case 'i':
                    count++;
                    break;
                case 'O':
                case 'o':
                    count++;
                    break;
                case 'U':
                case 'u':
                    count++;
                    break;
                case ' ':
                    spaceCount++;
            }
        }
        System.out.printf("The number of vowels is %d\n", count);
        System.out.printf("The number of consonants is %d\n", str.length() - spaceCount - count);
    }
}
