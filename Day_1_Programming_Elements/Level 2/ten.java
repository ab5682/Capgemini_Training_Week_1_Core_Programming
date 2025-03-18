import java.util.*;
public class ten{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int numberOfChocolates = input.nextInt();
int numberOfStudents = input.nextInt();
int chocolatePerStudent = numberOfChocolates/numberOfStudents;
int remainingChocolates = numberOfChocolates%numberOfStudents;
System.out.println("The number of chocolates each child gets is " + chocolatePerStudent + " and the number of remaining chocolates are " + remainingChocolates);
}
}
