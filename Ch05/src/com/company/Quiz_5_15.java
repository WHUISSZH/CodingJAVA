package com.company;

public class Quiz_5_15 {
    public void printACSII(){
        for (int i = (int)'!'; i <= (int)'~'; i++){
            if ((i - '!' + 1) % 10 == 0){
                System.out.printf("%3c\n", (char)i);
            }else
                System.out.printf("%3c", (char)i);
        }
    }
}
