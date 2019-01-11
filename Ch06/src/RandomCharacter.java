public class RandomCharacter {
    private static char getRandomChar(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1) + 1);
    }

    public static char getRandomLowwerCaseLetter(){
        return getRandomChar('a', 'z');
    }

    public static char getRandomUpperCaseLetter(){
        return getRandomChar('A', 'Z');
    }

    public static char getRandomDigitCharacter(){
        return getRandomChar('0', '9');
    }

    public static char getRandomCharacter(){
        return getRandomChar('\u0000', '\uFFFF');
    }
}
