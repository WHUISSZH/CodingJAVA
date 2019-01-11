import java.util.Scanner;

class Quiz_7_21 {
    void printDropResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of balls: ");
        int balls = input.nextInt();
        System.out.print("Enter the slots in the bean machine: ");
        int slots = input.nextInt();
        int[] slotArray = new int[slots];

        for (int i = 1; i <= balls; i++){
            beanMachineResult(slotArray);
            System.out.println();
        }
        System.out.println();
        printHistoGram(slotArray);
    }

    private static void beanMachineResult(int[] slotArray){
        int slotCount = 0;
        //槽的数量比障碍杆少一
        for (int i = 1; i < slotArray.length; i++){
            if (Math.random() < 0.5){
                System.out.print("L");
            }else{
                System.out.print("R");
                slotCount++;
            }
        }
        slotArray[slotCount]++;
    }

    static int getMaxBallCount(int[] slotArray){
        int maxBallcount = slotArray[0];
        for (int i = 0; i < slotArray.length; i++){
            if (slotArray[i] > maxBallcount){
                maxBallcount = slotArray[i];
            }
        }
        return maxBallcount;
    }

    private static void printHistoGram(int[] slotArray){
        int high = getMaxBallCount(slotArray);

        for (int h = high; h >= 1; h--){
            for (int i = 0; i < slotArray.length; i++){
                if (slotArray[i] >= h){
                    System.out.print("O");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}