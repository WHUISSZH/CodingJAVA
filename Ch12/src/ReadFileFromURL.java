import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    void printResult(){
        System.out.print("Enter a url: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner inputOfUrl = new Scanner(url.openStream());
            while (inputOfUrl.hasNext()){
                String line = inputOfUrl.nextLine();
                count += line.length();
            }
            System.out.printf("The file size is %d character", count);
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        }catch (IOException ex){
            System.out.println("I/O error: no such file");
        }

    }
}
