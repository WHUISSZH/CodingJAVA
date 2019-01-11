package com.company;

public class MulitplicationTable {
    public void printMultiplicationTable(){
        System.out.println("              Multiplication Table");
        System.out.print("      ");
        for (int i = 1; i <= 9; i++){
            System.out.printf("   " + i);
        }

        System.out.print("\n--------------------------------------------------");
        for (int j = 1; j < 10; j++){
            System.out.printf("\n  %d | ", j);
            for (int i = 1; i <= j; i++){
                    System.out.printf("%4d", j * i);
            }
        }
    }
}
