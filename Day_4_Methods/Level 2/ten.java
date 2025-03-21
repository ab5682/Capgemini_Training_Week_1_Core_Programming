import java.util.*;


public class ten {
  
   public static void calculateBMI(double[][] data) {
       for (int i = 0; i < data.length; i++) {
           double weight = data[i][0];
           double heightInMeters = data[i][1] / 100;
           data[i][2] = weight / (heightInMeters * heightInMeters);
       }
   }


   public static String getBMIStatus(double bmi) {
       if (bmi < 18.5) return "Underweight";
       else if (bmi >= 18.5 && bmi < 24.9) return "Normal weight";
       else if (bmi >= 25 && bmi < 39.9) return "Overweight";
       else return "Obese";
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double[][] data = new double[10][3];


       System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
       for (int i = 0; i < 10; i++) {
           System.out.print("Person " + (i + 1) + " Weight (kg): ");
           data[i][0] = input.nextDouble();
           System.out.print("Person " + (i + 1) + " Height (cm): ");
           data[i][1] = input.nextDouble();
       }


       calculateBMI(data);


       System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
       for (int i = 0; i < 10; i++) {
           double bmi = data[i][2];
           String status = getBMIStatus(bmi);
           System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), data[i][0], data[i][1], bmi, status);
       }
   }
}
