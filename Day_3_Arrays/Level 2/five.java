import java.util.*;
public class five {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        
        int temp = num;
        int count = 0;

        while(temp>0){
            count++;
            temp = temp/10;
        }

        int[] arr = new int[count];

        temp = num;
        for(int i =0 ; i < count; i++){
            arr[i] = temp % 10; 
            temp /= 10; 
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
    }
}

