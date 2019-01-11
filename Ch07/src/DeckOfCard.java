public class DeckOfCard {
    void printCard(){
        int [] deck = new int[52];

        String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};

        for(int i = 0; i < 52; i++){
            deck[i] = i;
        }

        for (int j = 0; j < 52; j++){
            int index = (int)(Math.random() * 52);
            int temp = deck[j];
            deck[j] = deck[index];
            deck[index] = temp;
        }

        for (int k = 0; k < 4; k++){
//            String suit = suits[deck[k] / 13];
//            String rank = ranks[deck[k] % 13];
//
//            System.out.printf("Card number is %d , %s, %s\n", deck[k], suit, rank);

            int cardNum = (int)(Math.random() * 52);
            String suit = suits[cardNum / 13];
            String rank = ranks[cardNum / 13];
            System.out.printf("Card number is %d, %s, %s\n", cardNum, suit, rank);
        }
    }
}
