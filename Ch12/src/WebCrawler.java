import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author callmezh
 */
class WebCrawler {
    private static final int limitionSize = 100;
    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a url: ");
        String url = input.next();
        crawler(url);
    }

    private static void crawler(String startUrl){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedUrl = new ArrayList<>();

        listOfPendingUrls.add(startUrl);
        while (!listOfPendingUrls.isEmpty() && listOfTraversedUrl.size() <= limitionSize){
            String urlString = listOfPendingUrls.remove(0);
            if (!listOfTraversedUrl.contains(urlString)){
                listOfTraversedUrl.add(urlString);
                System.out.println("crawl: " + urlString);

                for (String s: getSubUrls(urlString)){
                    if (!listOfPendingUrls.contains(s)){
                        listOfPendingUrls.add(s);
                    }
                }
            }

        }
    }

    private static ArrayList<String> getSubUrls(String urlString){
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0){
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }else {
                        current = -1;
                    }
                }
            }

        }catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
