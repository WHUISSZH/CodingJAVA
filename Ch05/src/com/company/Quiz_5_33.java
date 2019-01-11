package com.company;

public class Quiz_5_33 {
    public void findNum(){
        int resultNum = 6;
        System.out.print("result number is ");
        while (resultNum <= 10000){
            int temp = 1;
            for (int i = 2; i <= resultNum / 2; i++){
                if (resultNum % i == 0){
                    temp += i;
                }
            }
            if (temp == resultNum){
                System.out.printf("%6d", resultNum);
            }
            resultNum++;
        }

    }
}
