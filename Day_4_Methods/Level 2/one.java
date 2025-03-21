import java.util.*;
public class one{
   public static int[] findFactors(int number){
       int count = 0;
       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
               count++;
           }
       }
       int[] factors = new int[count];
       int index = 0;


       for(int i = 1; i <= number ; i++ ){
           if (number % i == 0) {
               factors[index++] = i;
           }
       }
       return factors;
   }


   public static int sumOfSquaresOfFactors(int[] factors) {
       int sum = 0;
       for (int i=0; i < factors.length; i++) {
           sum += Math.pow(factors[i], 2);
       }
       return sum;
   }


   public static long productOfFactors(int[] factors) {
       long product = 1;
       for (int factor : factors) {
           product *= factor;
       }
       return product;
   }


   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int num = input.nextInt();


       int[] factors = findFactors(num);
       System.out.println("Factors of " + num + " are :");
       for(int i=0;i<factors.length;i++){
           System.out.println(factors[i]);
       }


       int sumOfSquaresOfFactors = sumOfSquaresOfFactors(factors);
       System.out.println("Sum of Squares of Factors are : " + sumOfSquaresOfFactors);


       long productOfFactors = productOfFactors(factors);
       System.out.println("Product of Factors : " + productOfFactors);
   }
}
