import java.util.*;
public class eight {
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest Number = " + result[0]);
        System.out.println("Largest Number = " + result[1]);

    }
}
