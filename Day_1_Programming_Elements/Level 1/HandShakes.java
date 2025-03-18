import java.util.*;

public class HandShakes{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int numberOfStudents = input.nextInt();
int handShakes = (numberOfStudents * (numberOfStudents-1)) / 2;
System.out.println("Total Hand Shakes between " + numberOfStudents + " are " + handShakes);
}
}

