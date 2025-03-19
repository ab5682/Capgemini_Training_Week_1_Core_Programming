import java.util.*;

public class seventeen {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter salary: ");
double salary = input.nextDouble();
System.out.print("Enter years: ");
int yearsOfService = input.nextInt();
if (yearsOfService > 5) {
double bonus = 0.05 * salary;
System.out.println("Eligible for bonus of: " + bonus);
} else {
System.out.println("Not eligible for bonus.");
}
}
}

