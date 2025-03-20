import java.util.*;
public class six {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] arr = new double[11];
        double sum = 0;
        for (int i = 0 ; i < 11; i++){
            System.out.print("\nEnter height : ");
            arr[i] = input.nextDouble();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

        double meanHeight = sum / 11;
        System.out.println("Mean Height = " + meanHeight);
    }
}
