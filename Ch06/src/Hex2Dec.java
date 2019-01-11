import java.util.Scanner;

public class Hex2Dec {
    void printDec(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.next();
        System.out.printf("The dec number is: %d", hex2Dec(hex.toUpperCase()));
    }

    private int hex2Dec(String hex){
        int dec = 0;
        for (int i = 0; i <= hex.length() - 1; i++){
            char hexChar = hex.charAt(i);
            dec = dec * 16 + hexChar2Dec(hexChar);
        }
        return dec;
    }

    private int hexChar2Dec(char hexChar){
        if (hexChar >= 'A' && hexChar <= 'Z'){
            return 10 + hexChar - 'A';
        }else
            return hexChar - '0';
    }
}
