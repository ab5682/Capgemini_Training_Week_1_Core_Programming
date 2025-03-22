import java.util.*;
public class two {
   public static String subStringUsingCharAt(String str, int start, int end){
       StringBuilder result = new StringBuilder();
       for(int i = start; i< end; i++){
           result.append(str.charAt(i));
       }
       return result.toString();
   }
   public static boolean CompareUsingCharAt(String str1, String str2){
       if(str1.length()!=str2.length()){
           return false;
       }
       for(int i =0 ; i<str1.length();i++){
           if(str1.charAt(i)!=str2.charAt(i)){
               return false;
           }
       }
       return true;
   }


   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a String : ");
       String str = input.nextLine();
       System.out.print("\n Enter index : ");
       int startIndex = input.nextInt();
       System.out.print("\n Enter end index : ");
       int endIndex = input.nextInt();


       String subStringCharAt = subStringUsingCharAt(str, startIndex, endIndex);
       String subStringBuiltIn = str.substring(startIndex, endIndex);


       boolean comparisonResult = CompareUsingCharAt(subStringCharAt, subStringBuiltIn);


       System.out.println("Substring using charAt(): " + subStringCharAt);
       System.out.println("Substring using built-in substring(): " + subStringBuiltIn);
       System.out.println("Comparison result: " + (comparisonResult ? "Both substrings are equal." : "Substrings are different."));






   }
}
