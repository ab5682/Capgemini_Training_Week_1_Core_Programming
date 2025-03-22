import java.util.Scanner;


public class eight {


   public static void generateException(String[] names, int index) {
       System.out.println("Name at index " + index + ": " + names[index]);
   }


   public static void handleException(String[] names, int index) {
       try {
           System.out.println("Name at index " + index + ": " + names[index]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
       } catch (RuntimeException e) {
           System.out.println("Caught RuntimeException: " + e.getMessage());
       }
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};


       System.out.print("Enter an index to access (0-4): ");
       int index = scanner.nextInt();


       // generateException(names, index);


       handleException(names, index);


       scanner.close();
   }
}
