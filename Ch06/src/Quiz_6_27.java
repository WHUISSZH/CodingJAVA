import java.util.Scanner;

class Quiz_6_27 {
    void printReverPrimeNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;

        int i = 2;
        //大于等于2，因为这样可以直接排除1的可能性
        while (i <= num){
            if (PrimeNumMethod.isPrimeNum(i) && !Quiz_5_3.isPalindrome(String.valueOf(i)) && PrimeNumMethod.isPrimeNum(Integer.parseInt(Quiz_5_3.reverse(String.valueOf(i))))){
                count++;
                if (count % 10 == 0){
                    System.out.printf("%4d\n", i);
                }else
                    System.out.printf("%4d", i);
            }
            i++;
        }
    }
}