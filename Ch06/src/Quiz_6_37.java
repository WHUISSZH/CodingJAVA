import java.util.Scanner;

class Quiz_6_37 {
    void printFormatNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();

        System.out.printf("%s", format(num, width));
    }

    private static String format(int num, int width){
        String formatNum = num + "";
        if (formatNum.length() >= width){
            return formatNum;
        }else{
            for (int i = 1; i <= width - String.valueOf(num).length(); i++){
                formatNum = "0" + formatNum;
            }
        }

        return formatNum;
    }
}
