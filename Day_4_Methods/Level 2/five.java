import java.util.*;
public class five {
   public static double convertYardsToFeet(double yards) {
       double yards2feet = 3;
       return yards * yards2feet;
   }


   public static double convertFeetToYards(double feet) {
       double feet2yards = 0.333333;
       return feet * feet2yards;
   }


   public static double convertMetersToInches(double meters) {
       double meters2inches = 39.3701;
       return meters * meters2inches;
   }


   public static double convertInchesToMeters(double inches) {
       double inches2meters = 0.0254;
       return inches * inches2meters;
   }


   public static double convertInchesToCentimeters(double inches) {
       double inches2cm = 2.54;
       return inches * inches2cm;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a natural number : ");
       double num = input.nextDouble();


       System.out.println(num + " yards to feet: " + convertYardsToFeet(num));
       System.out.println(num + " feet to yards: " + convertFeetToYards(num));
       System.out.println(num + " meters to inches: " + convertMetersToInches(num));
       System.out.println(num + " inches to meters: " + convertInchesToMeters(num));
       System.out.println(num + " inches to centimeters: " + convertInchesToCentimeters(num));


   }   
}
