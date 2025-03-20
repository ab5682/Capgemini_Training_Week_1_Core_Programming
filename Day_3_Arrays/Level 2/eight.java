import java.util.*;

public class eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student for physics,chemistry and maths " + (i + 1) + " (out of 100):");

            physics[i] = input.nextInt();
            chemistry[i] = input.nextInt();
            maths[i] = input.nextInt();

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; 
            }
        }

        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-8s\n", 
                              (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

    }

}
