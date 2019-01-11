package com.company;

public class Quiz_5_20 {
    public void printPrimeNum(){
        int num = 2;
        int count = 0;
        while (num <= 1000){
            boolean isPrimeNum = true;
            for (int k = 2; k <= num / 2; k++){
                if (num % k == 0){
                    isPrimeNum = false;
                    break;
                }
            }
                if (isPrimeNum){
                    count++;
                    if (count % 8 == 0){
                        System.out.printf("%5d\n", num);
                    }else
                        System.out.printf("%5d", num);
                }
            num++;
        }
    }
}
