import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    static void printResult() throws IOException {
        File file = new File("score.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        //write formatted output to the file
        output.print("zh");
        output.println(99);
        output.print("wf");
        output.println(89);

        //close the file
        output.close();
    }
}
