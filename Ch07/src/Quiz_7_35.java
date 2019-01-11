import java.util.Scanner;

public class Quiz_7_35 {
    void printGuessResult(){
        Scanner input = new Scanner(System.in);
        String choose;
        String[] words = {"program", "whuiss", "sca", "univer"};

        do {
            guess(words);
            System.out.print("Do you want to guess another word? Enter y or n: ");
            choose = input.next();
        }while (choose == "y");
    }

    static void guess(String[] words){
        String hiddenWord = words[(int)(Math.random() * 4)];
        StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < hiddenWord.length(); i++){
            guessedWord.append("*");
        }

        Scanner input = new Scanner(System.in);

//        do {
//            System.out.printf("(Guess) Enter a letter in word %s >", cover);
//            String guess = input.next();
//
//            for (int i = 0; i < str.length(); i++){
//                if (guess.charAt(0) == str.charAt(i) && guess.charAt(0) != cover.charAt(i)){
//                    cover = cover.replaceAll("#", guess);
//                }else if(guess.charAt(0) == str.charAt(i) && guess.charAt(0) == cover.charAt(i)){
//                    System.out.printf("%s is already in the word\n", guess);
//                } else if (guess.charAt(0) != str.charAt(i)){
//                        System.out.printf("%s is not in the word\n", guess);
//                        missedCount++;
//                }
//            }
//        }while (!cover.equals(str));

        int missedCount = 0;
        int correctCount = 0;
        while (correctCount < hiddenWord.length()){
            System.out.printf("(Guess) Enter a letter in word %s >", guessedWord);
            String str = input.next();
            char guess = str.charAt(0);

            if (guessedWord.indexOf(String.valueOf(guess)) >= 0){
                System.out.printf("%s is already in the word\n", guess);
            }else if (guessedWord.indexOf(String.valueOf(guess)) < 0){
                System.out.printf("%s is not in the word\n", guess);
                missedCount++;
            }else{
                int k = hiddenWord.indexOf(guess);
                while (k >= 0){
                    guessedWord.setCharAt(k, guess);
                    correctCount++;
                    k =   hiddenWord.indexOf(guess, k + 1);
                }
            }
        }

        System.out.printf("The word is %s, you missed %d %s\n", guessedWord, missedCount, missedCount > 1 ? "times" : "time");

    }
}
