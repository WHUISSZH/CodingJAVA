package com.company;

public class ChangKG2B {
    public void chang(){
        System.out.println(" 千克      磅");
        for (int i = 1; i < 200; i++){
            System.out.printf("%3d      %.1f\n", i, (i * 2.2));
        }
    }
}
