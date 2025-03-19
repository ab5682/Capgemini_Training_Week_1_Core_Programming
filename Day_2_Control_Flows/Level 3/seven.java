import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9 && bmi >= 18.5) {
            status = "Normal weight";
        } else if (bmi <= 39.9 && bmi >= 25 ) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
