import java.util.*;
public class nine {
   public static boolean isPositive(int num) {
       return num >= 0;
   }


   public static boolean isEven(int num) {
       return num % 2 == 0;
   }


   public static int compare(int num1, int num2) {
       if (num1 > num2) return 1;
       else if (num1 < num2) return -1;
       else return 0;
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] numbers = new int[5];


       System.out.println("Enter 5 numbers:");
       for (int i = 0; i < 5; i++) {
           numbers[i] = input.nextInt();
       }


       for (int num : numbers) {                   
           if (isPositive(num)) {
               System.out.print(num + " is Positive and ");
               if (isEven(num)) {
                   System.out.println("Even.");
               } else {
                   System.out.println("Odd.");
               }
           } else {
               System.out.println(num + " is Negative.");
           }
       }


       int result = compare(numbers[0], numbers[4]);
       if (result == 1) {
           System.out.println("First number is greater than the last number.");
       } else if (result == -1) {
           System.out.println("First number is less than the last number.");
       } else {
           System.out.println("First and last numbers are equal.");
       }


   }
}
