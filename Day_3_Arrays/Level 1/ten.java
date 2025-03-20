import java.util.*;
public class ten {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size = input.nextInt();

        String[] arr = new String[size+1];
        for(int i =0; i<size; i++){
           
            if( i%3==0 && i%5==0){
                arr[i] = "FizzBuzz";
            }
            else if (i%3==0){
                arr[i] = "Fizz";
            }
            else if(i%5==0){
                arr[i] = "Buzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }
        }
        for(int i = 0 ; i < size ; i++){
            System.out.println(arr[i]);
        }
    }
}
 
