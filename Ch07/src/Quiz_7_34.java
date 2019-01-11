import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_34 {
    void printSortString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String[] strCharArray = new String[str.length()];
        for (int i =0; i < str.length(); i++){
            strCharArray[i] = String.valueOf(str.charAt(i));
        }

        Arrays.sort(strCharArray);
        System.out.print(Arrays.toString(strCharArray));
    }
}
