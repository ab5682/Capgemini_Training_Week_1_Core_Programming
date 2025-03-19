import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num;
        int sum = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10; 
            sum += digit * digit * digit; 
            originalNum /= 10; 
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}
