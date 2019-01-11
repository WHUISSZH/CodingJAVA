package com.company;

import java.util.Scanner;

public class Palindrome {
    public void checkPalindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int high = word.length() - 1;
        int low = 0;
        boolean isPalindrome = true;

        while (low <= high){
            if (word.charAt(low) != word.charAt(high)){
                isPalindrome = false;
                break;
            }
            high--;
            low++;
        }

        if (isPalindrome){
            System.out.printf("%s is a palindrome", word);
        }else
            System.out.printf("%s is not a palindrome", word);
    }
}
