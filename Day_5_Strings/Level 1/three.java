import java.util.*;
public class three {


   public static char[] getCharacters(String str){
       char[] characters = new char[str.length()];
       for ( int i =0 ; i<str.length();i++){
           characters[i] = str.charAt(i);
       }
       return characters;
   }


   public static boolean compareStringArray(char[] arr1, char[] arr2){
       if(arr1.length != arr2.length){
           return false;
       }
       for(int i = 0; i<arr1.length;i++){
           if(arr1[i]!=arr2[i]){
               return false;
           }
       }
       return true;
   }


   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a String : ");
       String str = input.nextLine();


       char[] charArrayCustom = getCharacters(str);
       char[] charArrayBuiltIn = str.toCharArray();


       boolean comparisonResult = compareStringArray(charArrayCustom, charArrayBuiltIn);


       System.out.println("Characters using user-defined method: " + new String(charArrayCustom));
       System.out.println("Characters using built-in toCharArray(): " + new String(charArrayBuiltIn));
       System.out.println("Comparison result: " + (comparisonResult ? "Both arrays are equal." : "Arrays are different."));


   }
  
}
