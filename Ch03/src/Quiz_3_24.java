public class Quiz_3_24 {
    public static void chooseCard(){
        int cardNum = (int)(Math.random() * 12);
        int cardSortNum = (int)(Math.random() * 4);
        String card = null;
        String sort = null;
        switch (cardSortNum) {
            case 0:
                sort = "Clubs";
                break;
            case 1:
                sort = "Diamonds";
                break;
            case 2:
                sort = "Hearts";
                break;
            case 3:
                sort = "Spades";
        }
        switch (cardNum){
            case 0:
                card = "Ace";
                break;
            case 1:
                card = "2";
                break;
            case 2:
                card = "3";
                break;
            case 3:
                card = "4";
                break;
            case 4:
                card = "5";
                break;
            case 5:
                card = "6";
                break;
            case 6:
                card = "7";
                break;
            case 7:
                card = "8";
                break;
            case 8:
                card = "9";
                break;
            case 9:
                card = "Jack";
                break;
            case 10:
                card = "Queen";
                break;
            case 11:
                card = "King";
        }
        System.out.print("The card you picked is " + card + " of " + sort);
    }
}
