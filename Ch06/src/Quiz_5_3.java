import java.util.Scanner;

class Quiz_5_3 {
    void testPalindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = input.nextLine();

        if (isPalindrome(num)){
            System.out.printf("%s is a palindrome!", num);
        }else
            System.out.printf("%s is not a palindrome! it's palindrome is %s", num, reverse(num));
    }

     static boolean isPalindrome(String num){
        boolean isPalindrome = true;
        for (int i = num.length() - 1; i >= 0; i--){
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    static String reverse(String num){
        String palindrome = "1";
        if (!isPalindrome(num)){
            for (int i = num.length() - 1; i >= 0; i--){
                palindrome  = palindrome + num.charAt(i);
            }
        }
        return palindrome;
    }

}
