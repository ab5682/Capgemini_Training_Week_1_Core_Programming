import java.util.*;
public class three{
public static void main(String[] aargs){
Scanner input = new Scanner(System.in);
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();

double w = a + b * c;
double x = a * b + c;
double y = c + a / b;
double z = a % b + c;

System.out.println("a + b * c = " + w);
System.out.println("a * b + c = " + x);
System.out.println("c + a / b = " + y);
System.out.println("a % b + c = " + z);
}
}
