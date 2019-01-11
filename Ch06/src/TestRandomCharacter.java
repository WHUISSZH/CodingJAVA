public class TestRandomCharacter {
        void test() {
            final int NUM_OF_CHARS = 175;
            final int CHARS_PER_LINE = 5;

            for (int i = 1; i <= NUM_OF_CHARS; i++) {
                char ch = RandomCharacter.getRandomUpperCaseLetter();
                if (i % CHARS_PER_LINE == 0) {
                    System.out.println(ch);
                } else
                    System.out.print(ch);
            }
        }

}