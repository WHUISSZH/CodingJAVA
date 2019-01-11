public class Quiz_7_23 {
    void PrintOpen(){
        boolean[] isOpen = new boolean[100];
        openCloseDoor(isOpen);
        for (int i = 0; i < isOpen.length; i++){
            if (isOpen[i]){
                System.out.print(i + 1 + " is open\n");
            }
        }
    }

    static void openCloseDoor(boolean[] isOpen){
        for (int i = 1; i <= 100; i++){
            for (int j = i - 1; j < isOpen.length; j = j + (i - 1)){
                isOpen[j] = !isOpen[j];
                j++;
            }
        }
    }
}
