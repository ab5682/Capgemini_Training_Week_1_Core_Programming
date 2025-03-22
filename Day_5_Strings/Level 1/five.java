import java.util.*;
public class five {
   public static void generateException(String text){
       System.out.println("Character at invalid index: " + text.charAt(text.length()));
   }
   public static void handleException(String text) {
       try {
           System.out.println("Character at invalid index: " + text.charAt(text.length()));
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
       }
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a String : ");
       String text = input.nextLine();


       //generateException(text)


       handleException(text);
   }
}
