import java.util.*;
public class three{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 6 - 9 : ");
int num = input.nextInt();
for (int i = 1; i <= 10; i++){
System.out.println(num + " * " +  i + " = " + (num*i));
}
}
}

