import java.util.*;
public class nine {
   public static String toUpperCaseCustom(String str){
       StringBuilder upperCaseText = new StringBuilder();
       for(int i = 0; i<str.length();i++){
           char ch = str.charAt(i);
           if(ch >='a' && ch <= 'z'){
               ch = (char) (ch-32);
           }
           upperCaseText.append(ch);
       }
       return upperCaseText.toString();
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


       String upperCaseCustom = toUpperCaseCustom(text);
       String upperCaseBuiltIn = text.toUpperCase();


       boolean comparisonResult = compareString(upperCaseCustom, upperCaseBuiltIn);


       System.out.println("Uppercase using custom method: " + upperCaseCustom);
       System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
       System.out.println("Comparison result: " + (comparisonResult ? "Both strings are equal." : "Strings are different."));
   }
}
