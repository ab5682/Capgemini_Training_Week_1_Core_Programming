import java.util.*;
public class two{
public static void main(String[] aargs){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

int w = a + b * c;
int x = a * b + c;
int y = c + a / b;
int z = a % b + c;

System.out.println("a + b * c = " + w);
System.out.println("a * b + c = " + x);
System.out.println("c + a / b = " + y);
System.out.println("a % b + c = " + z);
}
}

