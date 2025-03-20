import java.util.*;

public class ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] frequency = new int[10];

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;  
            frequency[digit]++;     
            temp /= 10;             
        }

        System.out.println("Digit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
