package com.company;

public class PrintNum {
    public void printNum(){
        final int NUM_OF_PRIMES = 50;
        final int NUM_OF_PER_LINE = 10;

        int num = 2;
        int count = 0;

        while (count < NUM_OF_PRIMES){
            boolean isPrime = true;
            for (int k = 2; k <= num / 2; k++){
                if (num % k == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                if (count % NUM_OF_PER_LINE == 0){
                    System.out.printf("%4d\n", num);
                }else
                    System.out.printf("%4d", num);
            }
            num++;
        }
    }
}
