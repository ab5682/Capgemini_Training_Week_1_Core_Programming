import java.util.*;
public class three {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int[] arr = new int[10];

        for(int i = 1; i <= 10;i++){
            int mul = num*i;
            arr[i-1] = mul;
        }
        for(int x = 0 ; x<10;x++){
            System.out.println(num + " * " + (x+1) + " = " + arr[x] );
        }
    }
}
