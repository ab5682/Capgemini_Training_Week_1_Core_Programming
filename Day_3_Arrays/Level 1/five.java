import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 6 - 9: ");
        int num = input.nextInt();

        if (num >= 6 && num <= 9) {
            int[] mul = new int[10];

            for (int i = 1; i <= 10; i++) {
                mul[i - 1] = num * i;
            }

            System.out.println("Multiplication table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + mul[i - 1]);
            }
        } else {
            System.out.println("Enter a number between 6 and 9.");
        }

    }
}
