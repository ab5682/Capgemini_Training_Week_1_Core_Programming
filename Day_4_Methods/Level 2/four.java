import java.util.*;
public class four {


   public static double convertKmToMiles(double km) {
       double km2miles = 0.621371;
       return km * km2miles;
   }


   public static double convertMilesToKm(double miles) {
       double miles2km = 1.60934;
       return miles * miles2km;
   }


   public static double convertMetersToFeet(double meters) {
       double meters2feet = 3.28084;
       return meters * meters2feet;
   }


   public static double convertFeetToMeters(double feet) {
       double feet2meters = 0.3048;
       return feet * feet2meters;
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a natural number : ");
       double num = input.nextDouble();
       System.out.println(num + " km to miles: " + convertKmToMiles(num));
       System.out.println(num + " miles to km: " + convertMilesToKm(num));
       System.out.println(num + " meters to feet: " + convertMetersToFeet(num));
       System.out.println(num + " feet to meters: " + convertFeetToMeters(num));
   }
}
