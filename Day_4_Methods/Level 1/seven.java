import java.util.*;
public class seven {
    public static int sum(int num){
        return (num * (num+1) / 2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("Sum of " + num + " natural number = " + result);
    }
}
