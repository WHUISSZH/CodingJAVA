package com.company;

class Quiz_5_10 {
    void findNum(){
        int count = 0;
        for (int k = 100; k <= 1000; k++){
            boolean isGoodNum = false;
            if ((k % 5 == 0) && (k % 6 == 0)){
                isGoodNum = true;
            }
            if (isGoodNum){
                count++;
                if (count % 5 == 0){
                    System.out.printf("%5d\n", k);
                }else
                    System.out.printf("%5d", k);
            }
        }
    }
}
