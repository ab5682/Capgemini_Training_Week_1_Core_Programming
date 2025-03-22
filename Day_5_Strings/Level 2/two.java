import java.util.*;
public class two{


   public static int Length(String str){
       int count = 0;
       try{
           while(true){
               str.charAt(count);
               count++;
           }
       }catch (IndexOutOfBoundsException e){


       }
       return count;
   }


   public static String[] customSplit(String str) {
       int length = Length(str);
       int wordCount = 1;


       for (int i = 0; i < length; i++) {
           if (str.charAt(i) == ' ') {
               wordCount++;
           }
       }


       int[] spaceIndexes = new int[wordCount - 1];
       int spaceIndex = 0;
       for (int i = 0; i < length; i++) {
           if (str.charAt(i) == ' ') {
               spaceIndexes[spaceIndex++] = i;
           }
       }


       String[] words = new String[wordCount];
       int start = 0;
       for (int i = 0; i < spaceIndexes.length; i++) {
           words[i] = str.substring(start, spaceIndexes[i]);
           start = spaceIndexes[i] + 1;
       }
       words[wordCount - 1] = str.substring(start, length);


       return words;
   }
   public static boolean compareArrays(String[] arr1, String[] arr2) {
       return Arrays.equals(arr1, arr2);
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a String :");
       String str = input.nextLine();


       String[] custom = customSplit(str);
       String[] builtIn = str.split(" ");


       boolean equal = compareArrays(custom, builtIn);


       System.out.println("Words using custom method: " + Arrays.toString(custom));
       System.out.println("Words using built-in split(): " + Arrays.toString(builtIn));
       System.out.println("Are both methods equal? " + equal);
   }
}
