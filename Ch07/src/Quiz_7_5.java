import java.util.Scanner;

class Quiz_7_5 {
    void printNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numArray = new int[5];
        int[] distinctNumArray = new int[5];

        for (int i = 0; i < 5; i++){
            numArray[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++){

            for (int j = i + 1; j < 5; j++){
                if (numArray[i] == numArray[j]){
                    numArray[j] = 0;
                }else
                    distinctNumArray[i] = numArray[i];
            }
        }

        System.out.print("The number of distinct number: ");
        for (int i = 0; i < distinctNumArray.length; i++){
            if (distinctNumArray[i] != 0){
                System.out.print(numArray[i] + "  ");
                break;
            }
        }

        System.out.print("\nThe distinct numbers are: ");
        for (int aNumArray : numArray) {
            if (aNumArray != 0) {
                System.out.print(aNumArray + "  ");
            }
        }
    }
}
