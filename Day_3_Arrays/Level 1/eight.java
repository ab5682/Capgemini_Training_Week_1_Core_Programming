import java.util.*;
public class eight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = input.nextInt();
        int maxFactor = 10;
        int arr[] = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(arr, 0, temp, 0, arr.length);
                    arr = temp;
                }
                arr[index++] = i;
            }
        }
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
