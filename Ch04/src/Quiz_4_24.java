import java.util.Scanner;

public class Quiz_4_24 {
    public void showCity() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1Str = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2Str = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3Str = input.nextLine();

       if(city1Str.compareTo(city2Str) > 0){
           String temp = city1Str;
           city1Str = city2Str;
           city2Str = temp;
       }

       if (city2Str.compareTo(city3Str) > 0){
           String temp = city2Str;
           city2Str = city3Str;
           city3Str = temp;
       }

       if (city1Str.compareTo(city2Str) > 0 ){
           String temp = city1Str;
           city1Str = city2Str;
           city2Str = temp;
       }

       System.out.printf("The three cities in a alphabetical order are : %s, %s, %s", city1Str, city2Str, city3Str);
    }
}
