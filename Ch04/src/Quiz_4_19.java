import java.util.Scanner;

public class Quiz_4_19 {
    public void computeISBN(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first 9 digits of an ISBN as String: ");
        String ISBN_Str = input.nextLine();

        if (ISBN_Str.length() != 9){
            System.out.printf("You must enter exactly 9 numbers!");
            System.exit(1);
        }

        int[] d = new int[9];
        for (int i = 0; i < 9; i++){
            d[i] = ISBN_Str.charAt(i) - 48;
        }

        int d10 = (d[0]* 1 + d[1]* 2 + d[2] * 3 + d[3] * 4 + d[4] * 5 + d[5] * 6 + d[6] * 7 + d[7] * 8 + d[8] * 9) % 11;

        if (d10 ==10){
            System.out.println("The ISBN-10 number is " + d[0] + d[1] + d[2] +d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + "X");
        }else
            System.out.println("The ISBN-10 number is " + d[0] + d[1] + d[2] +d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d10);
    }
}
