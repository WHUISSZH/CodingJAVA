import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    private final int length = 4;
    void replaceText(String[] args) throws IOException {
        //check command lines parameter usage
        if (args.length != length){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        //check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()){
            System.out.printf("Source file %s does not exits", args[0]);
            System.exit(2);
        }

        //check if target file exits
        File targetFile = new File(args[1]);
        if (!targetFile.exists()){
            System.out.printf("Target file %s does not exits", args[0]);
            System.exit(3);
        }

        try (
                //Create input and output
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile)
                ) {
                while (input.hasNext()){
                    String s1 = input.nextLine();
                    String s2 = s1.replaceAll(args[2], args[3]);
                    output.println(s2);
                }
        }
    }
}
