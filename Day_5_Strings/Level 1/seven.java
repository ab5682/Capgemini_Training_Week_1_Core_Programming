import java.util.Scanner;


public class seven {


   public static void generateException(String text) {
       int number = Integer.parseInt(text);
       System.out.println("Parsed number: " + number);
   }


   public static void handleException(String text) {
       try {
           int number = Integer.parseInt(text);
           System.out.println("Parsed number: " + number);
       } catch (NumberFormatException e) {
           System.out.println("Caught NumberFormatException: " + e.getMessage());
       } catch (RuntimeException e) {
           System.out.println("Caught RuntimeException: " + e.getMessage());
       }
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


       System.out.print("Enter a number as a string: ");
       String text = input.next();


       // generateException(text);


       handleException(text);


   }
}
