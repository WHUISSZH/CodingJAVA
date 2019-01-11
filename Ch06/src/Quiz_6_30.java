public class Quiz_6_30 {
    static boolean printCrapsResult(){
        int craps1 = craps();
        int craps2 = craps();

        //Quiz 6.32

        boolean win = true;

        switch (craps1 + craps2){
            case 2:
            case 3:
            case 12:
                System.out.printf("You rolled %d + %d = %d\n You lose\n", craps1, craps2, craps1 + craps2);
                return false;
//                System.exit(0);
//                break;
            case 7:
            case 11:
                System.out.printf("You rolled %d + %d = %d\n You win\n", craps1, craps2, craps1 + craps2);
                return true;
//                System.exit(1);
//                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.printf("You rolled %d + %d = %d\n Point is %d\n", craps1, craps2, craps1 + craps2, craps1 + craps2);

                int craps3;
                int craps4;

                 do{
                    craps3 = craps();
                    craps4 = craps();
                    System.out.printf("You rolled %d + %d = %d\n", craps3, craps4, craps3 + craps4);
                }while (craps3 + craps4 != 7 && (craps3 + craps4 != craps1 + craps2));

            if (craps3 + craps4 == 7){
                    System.out.print("You lose\n");
                    win = false;
                }else {
                    System.out.print("You win\n");
                }
        }

//        int dice = getDice();
//
//        if (dice == 7 || dice == 11) {
//            System.out.println("You win");
//            System.exit(1);
//        }else if (dice == 2 || dice == 3 || dice == 12) {
//            System.out.println("You lose");
//            System.exit(2);
//        }
//
//        int point = dice;
//        System.out.println("point is " + point);
//        do {
//            dice = getDice();
//        } while (dice != 7 && dice != point);
//
//        if (dice == 7)
//            System.out.println("You lose");
//        else
//            System.out.println("You win");
        return win;
    }


    // Get a dice
    public static int getDice() {
        int i1 = 1 + (int)(Math.random() * 6);
        int i2 = 1 + (int)(Math.random() * 6);

        System.out.println("You rolled " + i1 + " + " + i2 + " = " + (i1 + i2));
        return i1 + i2;
    }

    static int craps(){
        return  (int)(1 + Math.random() * 5 + 1);
    }


}