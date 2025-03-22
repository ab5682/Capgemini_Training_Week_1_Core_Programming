import java.util.*;
public class ten {
   public static String toLowerCaseCustom(String str){
       StringBuilder lowerCaseText = new StringBuilder();
       for(int i = 0; i<str.length();i++){
           char ch = str.charAt(i);
           if(ch >='A' && ch <= 'Z'){
               ch = (char) (ch+32);
           }
           lowerCaseText.append(ch);
       }
       return lowerCaseText.toString();
   }


   public static boolean compareString(String str1,String str2){
       if(str1.length()!=str2.length()){
           return false;
       }
       for(int i = 0; i<str1.length(); i++){
           if(str1.charAt(i)!=str2.charAt(i)){
               return false;
           }
       }
       return true;
   }
  
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a String : ");
       String text = input.nextLine();


       String lowerCaseCustom = toLowerCaseCustom(text);
       String lowerCaseBuiltIn = text.toLowerCase();


       boolean comparisonResult = compareString(lowerCaseCustom, lowerCaseBuiltIn);


       System.out.println("Lowercase using custom method: " + lowerCaseCustom);
       System.out.println("Lowercase using built-in method: " + lowerCaseBuiltIn);
       System.out.println("Comparison result: " + (comparisonResult ? "Both strings are equal." : "Strings are different."));
   }
}
