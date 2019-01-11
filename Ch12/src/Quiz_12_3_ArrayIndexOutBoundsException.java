import java.sql.SQLSyntaxErrorException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author callmezh
 * 数组越界
 */
public class Quiz_12_3_ArrayIndexOutBoundsException {
    private final int length = 100;
    void printResult(){
        int [] randomNum = new int[100];
        Random random = new Random();
        for (int i = 0; i < length; i++){
            randomNum[i] = random.nextInt();
        }
        System.out.print("Enter a index of array: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        try{
            System.out.print(randomNum[index]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.print("Out of bounds");
        }
    }
}
