import java.util.*;
public class one{
   public static int stringLength(String str){
       int count = 0;
       try {
           while (true) {
               str.charAt(count);
               count++;
           }
       } catch (IndexOutOfBoundsException e){
       }
       return count;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a String : ");
       String str = input.nextLine();


       int customLength = stringLength(str);
       int builtInLength = str.length();


       System.out.println("Length using custom method: " + customLength);
       System.out.println("Length using built-in method: " + builtInLength);


   }
}
