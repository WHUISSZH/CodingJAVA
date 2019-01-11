import java.io.File;
import java.util.Scanner;

public class ReadData {
    static void printResult() throws Exception{
//        File file = new File("score.txt");
//
//        //create a Scanner for the file
//        Scanner input = new Scanner(file);
//        //read data from file
//        while (input.hasNext()){
//            String name = input.next();
//            int score = input.nextInt();
//            System.out.printf("Name is %s, score is %d\n", name, score);
//        }
//        //close the file
//        input.close();

        //利用try-with-resources 重实现方法
        File file = new File("score.txt");
        try (
                //create a Scanner for the file
                Scanner input = new Scanner(file)
        ){

            //read data from file
            while (input.hasNext()){
                String name = input.next();
                int score = input.nextInt();
                System.out.printf("Name is %s, score is %d\n", name, score);
            }
            //close the file
            input.close();

        }
    }
}
