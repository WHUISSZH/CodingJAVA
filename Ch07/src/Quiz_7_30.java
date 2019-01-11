import java.util.Scanner;

public class Quiz_7_30 {
    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of value: ");
        int num = input.nextInt();
        System.out.print("Enter the values: ");
        int[] value = new int[num];
        for (int i = 0; i < num; i++){
            value[i] = input.nextInt();
        }

        System.out.print("Enter the continuous number: ");
        int continuousNum = input.nextInt();

        if (isEqual(value, continuousNum)){
            System.out.print("The list has continuous num");
        }else
            System.out.print("The list has not continuous num");
    }

    static boolean isEqual(int[] value, int continuousNum) {
        boolean isEqual = true;
        for (int i = 0; i <= value.length - continuousNum; i++){
            for (int j = i; j < i + continuousNum - 1; j++){
                if (value[j] != value[j + 1]){
                    isEqual = false;
                    break;
                }
            }

            if (isEqual){
                return true;
            }
        }

        return isEqual;
    }
}