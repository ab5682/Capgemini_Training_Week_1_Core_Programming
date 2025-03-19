import java.util.*;
public class twel{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number : ");
int num = input.nextInt();
System.out.print("Enter the power : ");
int power = input.nextInt();
if (num > 0 && power > 0) {
int result = 1;
for (int i = 1; i <= power; i++) {
result *= num;
}
System.out.println(num + " raised to the power of " + power + " is: " + result);
} else {
System.out.println("Enter valid numbers");
}
}
}
