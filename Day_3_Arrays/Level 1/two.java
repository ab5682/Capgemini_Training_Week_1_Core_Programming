import java.util.*;
public class two {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i<5;i++){
            System.out.print("Enter number : ");
            num[i] = input.nextInt();
        }
        for (int i = 0 ; i<5; i++){
            if(num[i]>0){
                if(num[i]%2==0){
                    System.out.println(num[i] +" is Even Positive number");
                }
                else if(num[i]%2!=0){
                    System.out.println(num[i] + " is Odd Positive number");
                }
            }
            else if(num[i]<0){
                System.out.println(num[i] + " is Negative number");
            }
            else if (num[i]==0){
                System.out.println(num[i] + " is zero");
            }
            else{
                System.out.println("Invalid number");
            }
        }
    }
}
