import java.util.*;

public class seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int num = input.nextInt();

        double[][] personData = new double[num][3]; 
        String[] weightStatus = new String[num];

        for (int i = 0; i < num; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight, enter again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid Height, enter again.");
                }
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

      
    }
}
