public class TestString {
     void test(){
         //String str1 = "PHP is the best language in the world!";
         String str1 = "PHP is";
         String str2 = "PHP Is";

         char ch = '1';
         String str3 = str1.substring(1);
         System.out.println(str3);

         System.out.println(str1.indexOf('i'));
         System.out.println(str1.indexOf('P', 1));
         System.out.println(str1.indexOf(" "));
         System.out.println(str1.lastIndexOf('P' , 2));
         System.out.println(str1.lastIndexOf("is",4));
System.out.print((int)ch + "uhiuh");
         //         System.out.println(str1);
//         System.out.println(str1.length());
//         System.out.println(str1.charAt(3));
//         System.out.println(str1.toLowerCase());
//         System.out.println(str1.toUpperCase());
//         System.out.println(str1.trim());

//         if (str1.equals(str2)){
//             System.out.println("the same");
//         }else
//             System.out.println("the different");
//
//         if (str1.equalsIgnoreCase(str2)){
//             System.out.println("same");
//         }else
//             System.out.println("different");

//         if (str1.startsWith(" ")){
//             System.out.println("same");
//         }else
//             System.out.println("PHP");
//
//         if (str1.contains(str2)){
//             System.out.println("has");
//         }else
//             System.out.println("not");
//
//         System.out.println(str1.compareToIgnoreCase(str2));
//         System.out.println('1' + 1 + 1);


     }
}