import java.util.*;


public class two {


   public static int sumUsingRecursion(int n) {
       if (n == 1) return 1; 
       return n + sumUsingRecursion(n - 1); 
   }


   public static int sumUsingFormula(int n) {
       return n * (n + 1) / 2;
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
       System.out.print("Enter a natural number : ");
       int num = input.nextInt();
      
       if (num <= 0) {
           System.out.println("Invalid input!");
           return;
       }


       int sumRec = sumUsingRecursion(num);
       int sumFormula = sumUsingFormula(num);


       System.out.println("Sum using recursion: " + sumRec);
       System.out.println("Sum using formula: " + sumFormula);


       if (sumRec == sumFormula) {
           System.out.println("Both computations match. The result is correct!");
       } else {
           System.out.println("Error in computation.");
       }
      
   }
}
