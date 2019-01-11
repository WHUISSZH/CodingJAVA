package com.company;

import java.util.Scanner;

public class Quiz_5_43 {
    void Combination(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number：");
        int num = input.nextInt();
        int combinationNum;
        int count = 0;
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                combinationNum = i * 10 + j;
                count++;
                if (count % num == 0)
                System.out.printf("%3d\n", combinationNum);
                    else
                    System.out.printf("%3d", combinationNum);
            }
        }
        System.out.printf("The total number of all combinationNum is %d", count);
    }
}
