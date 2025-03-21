import java.util.*;
public class ten {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of chocolates and number of childrens : ");
        int numberOfChocolates = input.nextInt();
        int numberOfChildrens = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildrens);

        System.out.println("Number of chocolate each child gets = " + result[0]);
        System.out.println("Number of remaining chocolates = " + result[1]); 
    }
    
}
