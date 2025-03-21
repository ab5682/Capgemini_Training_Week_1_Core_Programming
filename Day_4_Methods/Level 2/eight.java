import java.util.Scanner;


public class eight {


   public static String findYoungest(String[] names, int[] ages) {
       int minAge = ages[0];
       int minIndex = 0;
       for (int i = 1; i < ages.length; i++) {
           if (ages[i] < minAge) {
               minAge = ages[i];
               minIndex = i;
           }
       }
       return names[minIndex];
   }


   public static String findTallest(String[] names, double[] heights) {
       double maxHeight = heights[0];
       int maxIndex = 0;
       for (int i = 1; i < heights.length; i++) {
           if (heights[i] > maxHeight) {
               maxHeight = heights[i];
               maxIndex = i;
           }
       }
       return names[maxIndex];
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


       String[] names = {"Amar", "Akbar", "Anthony"};


       int[] ages = new int[3];
       double[] heights = new double[3];


       for (int i = 0; i < 3; i++) {
           System.out.print("Enter age of " + names[i] + ": ");
           ages[i] = input.nextInt();
           System.out.print("Enter height of " + names[i] + " (in cm): ");
           heights[i] = input.nextDouble();
       }


       String youngest = findYoungest(names, ages);
       String tallest = findTallest(names, heights);


       System.out.println("\nThe youngest friend is: " + youngest);
       System.out.println("The tallest friend is: " + tallest);


   }
}
