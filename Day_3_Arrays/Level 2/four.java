import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int maxDigit = 10; 
        int[] arr = new int[maxDigit];
        int index = 0;
         
        while (num != 0) {
            if (index == maxDigit) {
               
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];

                for (int i = 0; i < index; i++) {
                    tempArray[i] = arr[i];
                }

                arr = tempArray;
            }

            arr[index] = num % 10;
            num /= 10; 
            index++;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
