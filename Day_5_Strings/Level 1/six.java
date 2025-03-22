import java.util.*;


public class six {


   public static void generateException(String text) {
       System.out.println("Substring: " + text.substring(5, 2));
   }


   public static void handleException(String text) {
       try {
           System.out.println("Substring: " + text.substring(5, 2));
       } catch (IllegalArgumentException e) {
           System.out.println("Caught IllegalArgumentException: " + e.getMessage());
       } catch (RuntimeException e) {
           System.out.println("Caught RuntimeException: " + e.getMessage());
       }
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


       System.out.print("Enter a string: ");
       String text = input.next();


     
       // generateException(text);


       handleException(text);


   }
}
