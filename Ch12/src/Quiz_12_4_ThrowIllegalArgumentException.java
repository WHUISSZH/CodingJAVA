import com.sun.deploy.util.SyncAccess;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Quiz_12_4_ThrowIllegalArgumentException {
    static void printResult() throws Quiz_12_4_IllArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the loan rate: ");
        double rate = input.nextDouble();

        if (amount <= 0 || rate <= 0){
            throw new Quiz_12_4_IllArgumentException(amount, rate);
        }
    }

    void catchException(){
        try {
            printResult();
        }
        catch (Quiz_12_4_IllArgumentException ex){
            ex.getMessage();
        }
    }
}
