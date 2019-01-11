import java.util.Scanner;

public class OrderTwoCities {
    public void orderTwoCities(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two cities' name: ");
        String name1 = input.next();
        String name2 = input.next();

        char firstCharacterOfName1 = name1.charAt(0);
        char firstCharacterOfName2 = name2.charAt(0);

        if (firstCharacterOfName2 > firstCharacterOfName1){
            System.out.println("The cities in alphabetical order are " + name1 + " " + name2);
        }else
            System.out.println("The cities in alphabetical order are " + name2 + " " + name1);
    }
}
