import java.util.*;


public class seven {


   public static boolean canStudentVote(int age) {
       if (age >= 18 ) {
           return true;
       }
       else return false;
      
   }


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] studentAges = new int[10];


       for (int i = 0; i < studentAges.length; i++) {
           System.out.print("Enter age for student " + (i + 1) + ": ");
           studentAges[i] = input.nextInt();
       }


       for (int i = 0; i < studentAges.length; i++) {
           boolean canVote = canStudentVote(studentAges[i]);
           System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
       }
   }
}
