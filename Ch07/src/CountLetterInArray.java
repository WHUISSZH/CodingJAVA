public class CountLetterInArray {
    void printResult(){
        char[] letters = createArray();
        displayArray(letters);
        int[] count = countLetters(letters);

        System.out.println("Letter counts");
        for (int i = 0; i <= 25; i++){
            System.out.printf("   %c\t  %d\n", (char)(i + 'a'), count[i]);
        }
    }

    static char getRandomLowerCaseLetter(){
        return (char)('a' + Math.random() * 26);
    }

    static char[] createArray(){
        char[] letterArray = new char[100];
        for (int i = 0; i <= 99; i++){
            letterArray[i] = getRandomLowerCaseLetter();
        }
        return letterArray;
    }


    static void displayArray(char[] array){
        for (int i = 0; i <= array.length - 1; i++){
            if ((i + 1) % 20 == 0){
                System.out.print(array[i] + "\n");
            }else
                System.out.print(array[i]);
        }
    }

    static int[] countLetters(char[] array){
        int[] count = new int[26];
        for (int i = 0; i <= array.length - 1; i++){
            count[array[i] - 'a']++;
        }

        return count;
    }
}
