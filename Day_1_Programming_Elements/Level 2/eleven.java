import java.util.*;
public class eleven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int principal = input.nextInt();
int rate = input.nextInt();
int timeInYears = input.nextInt();
int simpleInterest = principal * rate * timeInYears / 100;
System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + " ,Rate of Interest " + rate + " and Time " + timeInYears + " years");
}
}
 
