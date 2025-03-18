import java.util.*;

public class Distance{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double feet = input.nextDouble();
double yard = feet/3;
double mile = yard/1760;

System.out.println("The distance in yards is " + yard + " while the distance in miles is " + mile);
}
}

