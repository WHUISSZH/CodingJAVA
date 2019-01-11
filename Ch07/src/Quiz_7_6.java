import java.util.Arrays;

public class Quiz_7_6 {
    void printPrimeResult(){
        int[] numArray = new int[50];
        int count = 0;
        int num = 2;

        while (count < 50){
            if (isPrime(num)){
                numArray[count] = num;

                if ((count  + 1) % 10 == 0){
                    System.out.printf("%5d\n", num);
                }else
                    System.out.printf("%5d", num);

                count++;
            }
            num++;
        }

        System.out.print(Arrays.toString(numArray));

    }

    static boolean isPrime(int num){
        boolean isPrime = true;

        for (int k = 2; k <= Math.sqrt(num); k++){
            if (num % k == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
