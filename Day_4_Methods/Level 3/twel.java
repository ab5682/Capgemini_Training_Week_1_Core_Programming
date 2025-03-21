import java.util.Random;

public class twel {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(90) + 10; 
            scores[i][1] = rand.nextInt(90) + 10; 
            scores[i][2] = rand.nextInt(90) + 10; 
        }
        return scores;
    }

    public static double[][] calculateScores(int[][] scores) {
        double[][] result = new double[scores.length][4]; 
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            
            double roundedAverage = Math.round(average * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = roundedAverage;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Student Scorecard");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        
        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            double total = result[i][0];
            double average = result[i][3];
            double percentage = result[i][2];

            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n", i+1, physics, chemistry, maths, total, average, percentage);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; 
        
        int[][] scores = generateScores(numStudents);
        
        double[][] result = calculateScores(scores);
        
        displayScorecard(scores, result);
    }
}
