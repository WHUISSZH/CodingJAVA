public class Quiz_3_4 {
    public static void showMonthes(){
        for(int i = 0; i < 10; i++){
        int numOfMonth = (int)(1 + Math.random() * 11 + 1);
        System.out.println(numOfMonth);
        switch (numOfMonth){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                    System.out.println("Ap");
                    break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Spe");
                break;
            case 10:
                System.out.println("Oco");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            }
        }
    }
}
