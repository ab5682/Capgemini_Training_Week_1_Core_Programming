import java.util.*;
public class fourteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number : ");
int num = input.nextInt();
System.out.print("Enter the power : ");
int power = input.nextInt();
if (num > 0 && power >= 0) {
int result = 1;
int i = 1;
while(i<=power){
result *= num;
i++;
}
System.out.println(num + " raised to the power of " + power + " is: " + result);
} else {
System.out.println("Enter valid numbers");
}
}
}
