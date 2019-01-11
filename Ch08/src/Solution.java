public class Solution {

    public static boolean isValid(String s) {

            if (s.length() == 0) {
                return true;
            }
            if (s.length() % 2 != 0) {
                return false;
            }

            int j = 0;
            for (int i = 0; i < s.length() / 2; i++){
                if (s.charAt(i) == 40 || s.charAt(j) == 40){
                    if ((s.charAt(j + 1) == 41 || s.charAt(s.length() - 1 - i) == 41)){
                        return true;
                    }
                }
                if (s.charAt(i) == 91 || s.charAt(j) == 91 ){
                    if ((s.charAt(j + 1) == 93 || s.charAt(s.length() - 1 - i) == 93)){
                        return true;
                    }
                }
                if (s.charAt(i) == 123 || s.charAt(j) == 123 ){
                    if ((s.charAt(j + 1) == 125 || s.charAt(s.length() - 1 - i) == 125)){
                        return true;
                    }
                }
                j += 2;
            }
            return false;
    }
}