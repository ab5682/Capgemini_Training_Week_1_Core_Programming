import java.util.*;
public class seven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();

        if (num <= 0 ){
            System.out.println("Error");
            System.exit(0);
        }
       
        int[] evenArr = new int[num / 2 + 1];
        int[] oddArr = new int[num / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= num ; i++){
            if(i%2==0){
                evenArr[evenIndex++] = i;
            }
            else{
                oddArr[oddIndex++] = i;
            }
        }
        System.out.println("Even Numbers : ");
        for(int i = 0; i<evenIndex;i++){
            System.out.println(evenArr[i]);
        }

        System.out.println("Odd Numbers : ");
        for(int i = 0; i<oddIndex;i++){
            System.out.println(oddArr[i]);
        }
    }
}
