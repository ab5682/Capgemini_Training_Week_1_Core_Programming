import java.util.*;

public class nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i; 
            }
        }

        if (sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is not an Abundant Number.");
        }

    }
}
