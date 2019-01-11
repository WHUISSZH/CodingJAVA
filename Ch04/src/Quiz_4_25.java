public class Quiz_4_25 {
    public void showNum(){
        char[]letter = new char[3];
        for (int i = 0; i < 3; i++){
            letter[i] = (char)(65 + Math.random() * 26 + 1);
        }
        int num = (int)(1000 + Math.random() * 8999 + 1);
        System.out.print("The result is " + letter[0] + letter[1] + letter[2] + num);
    }
}
