public class Quiz_7_24 {
    void printCard(){
        String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};

        int[] cardArray = new int[52];
        boolean[] pickedCard = new boolean[4];
        int count = 0;
        int numOfPicked = 0;

        while (count < 4){
            numOfPicked++;

            int index = (int)(Math.random() * 52);
            cardArray[index] = index;

            if (!pickedCard[index / 13]){
                pickedCard[index / 13] = true;
                count++;

                System.out.printf("%s of %s\n", ranks[index % 13], suits[index / 13]);
            }
        }

        System.out.print("Numbers of picked: " + numOfPicked);

//        for (int i = 0; i < card.length; i++){
//            switch (suits[card[i] / 13]){
//                case "Spades":
//                    numOfPickedCard[0]++;
//                    break;
//                case "Hearts":
//                    numOfPickedCard[1]++;
//                    break;
//                case "Diamonds":
//                    numOfPickedCard[2]++;
//                    break;
//                case "Clubs":
//                    numOfPickedCard[3]++;
//            }
//
//            if (numOfPickedCard[0] >= 1 &&
//                numOfPickedCard[1] >= 1 &&
//                numOfPickedCard[2] >= 1 &&
//                numOfPickedCard[3] >= 1 ){
//                break;
//            }
//        }

    }

    static int[] createAndBreakCard(){
        int[] cardArray = new int[52];
        for (int i = 0, j = 0; i < cardArray.length; i++, j++){
            cardArray[i] = i;
            //打乱顺序
            int index = (int)(Math.random() * 52);
            int temp = cardArray[i];
            cardArray[i] = cardArray[index];
            cardArray[index] = temp;
        }
        return cardArray;
    }

}
