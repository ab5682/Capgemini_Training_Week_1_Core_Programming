import java.util.Scanner;

public class one {

    public static String[] getBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] calculateAllBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = getBMIStatus(weight, height);
            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = bmiInfo[0];
            result[i][3] = bmiInfo[1];
        }
        return result;
    }

    public static void displayBMIResults(String[][] results) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = calculateAllBMI(data);
        displayBMIResults(bmiResults);
    }
}
