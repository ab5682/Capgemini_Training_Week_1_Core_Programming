import java.util.*;
public class six {
   public static double convertFahrenheitToCelsius(double fahrenheit) {
       return (fahrenheit - 32) * 5 / 9;
   }


   public static double convertCelsiusToFahrenheit(double celsius) {
       return (celsius * 9 / 5) + 32;
   }


   public static double convertPoundsToKilograms(double pounds) {
       double pounds2kilograms = 0.453592;
       return pounds * pounds2kilograms;
   }


   public static double convertKilogramsToPounds(double kilograms) {
       double kilograms2pounds = 2.20462;
       return kilograms * kilograms2pounds;
   }


   public static double convertGallonsToLiters(double gallons) {
       double gallons2liters = 3.78541;
       return gallons * gallons2liters;
   }


   public static double convertLitersToGallons(double liters) {
       double liters2gallons = 0.264172;
       return liters * liters2gallons;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a natural number : ");
       double num = input.nextDouble();


       System.out.println(num + "°F to Celsius: " + convertFahrenheitToCelsius(num));
       System.out.println(num + "°C to Fahrenheit: " + convertCelsiusToFahrenheit(num));
       System.out.println(num + " pounds to kilograms: " + convertPoundsToKilograms(num));
       System.out.println(num + " kilograms to pounds: " + convertKilogramsToPounds(num));
       System.out.println(num + " gallons to liters: " + convertGallonsToLiters(num));
       System.out.println(num + " liters to gallons: " + convertLitersToGallons(num));
   }
}
