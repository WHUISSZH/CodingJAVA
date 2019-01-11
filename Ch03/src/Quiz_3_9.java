import java.util.Scanner;

public class Quiz_3_9 {
    public static void computeISBN_10(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        int ISBN = input.nextInt();

        int d1 = ISBN / 100000000;
        ISBN %= 100000000;
        int d2 = ISBN / 10000000;
        ISBN %= 10000000;
        int d3 = ISBN / 1000000;
        ISBN %= 1000000;
        int d4 = ISBN / 100000;
        ISBN %= 100000;
        int d5 = ISBN / 10000;
        ISBN %= 10000;
        int d6 = ISBN / 1000;
        ISBN %= 1000;
        int d7 = ISBN / 100;
        ISBN %= 100;
        int d8 = ISBN / 10;
        ISBN %= 10;
        int d9 = ISBN / 1;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 ==10){
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 +d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 +d4 + d5 + d6 +d7 +d8 +d9 + d10);
    }
}
