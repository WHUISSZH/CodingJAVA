import java.util.Scanner;

/**
 * @author callmezh
 * 忽略符号后的字符串是否是回文字符
 */
public class PalindromIgnoreNonAlphanumeric {
    void printResult(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        if (isReverse(getStrNonAlphanumeric(str))){
            System.out.printf("Ignoring nonalphanumeric characters, %s is palindrom", str);
        }else{
            System.out.printf("Ignoring nonalphanumeric characters, %s is not palindrom", str);
        }
    }

    /**
     * 判断是否是回文字符串
     * @param str 简化后的字符
     * @return 判断结果
     */
    static boolean isReverse(StringBuilder str){
        String  oldStr = str.toString();
        String  reverseStr = PalindromIgnoreNonAlphanumeric.reverseStr(str);
//        System.out.println(s);
//        System.out.print(s1);
        if (oldStr.equals(reverseStr) ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 去除符号
     * @param str 原始字符
     * @return 简化后的字符
     */
    static StringBuilder getStrNonAlphanumeric(String str){
        StringBuilder strNonAlphanumeric = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetterOrDigit(str.charAt(i))){
                strNonAlphanumeric.append(str.charAt(i));
            }
        }
        return strNonAlphanumeric;
    }

    /**
     * 翻转简化后的字符
     * @param strNonAlphanumeric 简化后的字符
     * @return 翻转字符
     */
    static String reverseStr(StringBuilder strNonAlphanumeric){
        strNonAlphanumeric.reverse();
        return strNonAlphanumeric.toString();
    }
}
