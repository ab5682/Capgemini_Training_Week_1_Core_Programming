import java.util.*;
public class four {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i<10; i++){
            arr[i] = input.nextInt();
            if(arr[i]<=0){
                break;
            }
           
        }
        for(int i = 0; i<10; i++){
            System.out.print(arr[i]+ " ");
            sum += arr[i];
        }
        System.out.println("\nSum = " + sum);
    }
}
