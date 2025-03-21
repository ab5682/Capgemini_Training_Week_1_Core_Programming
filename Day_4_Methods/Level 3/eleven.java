import java.util.Random;

public class eleven {

    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2]; 
        
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            employeeData[i][1] = rand.nextInt(20) + 1;
        }
        return employeeData;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; 
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;
            
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }
            
            double newSalary = oldSalary + bonus;
            
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        System.out.println("Employee Salary and Bonus Details:");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i+1, oldSalary, newSalary, bonus);
        }
        
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f\n", "Total", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        double[][] employeeData = generateEmployeeData(numEmployees);
        
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        
        calculateAndDisplayTotals(updatedData);
    }
}
