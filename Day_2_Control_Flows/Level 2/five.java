import java.util.Scanner;

public class five {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");

int n = input.nextInt();
if (n > 0) {
while (n>0){
if (n % 3 == 0 && n % 5 == 0) {
System.out.println("FizzBuzz");
} else if (n % 3 == 0) {
System.out.println("Fizz");
} else if (n % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(n);
}
n--;
}
}
else {
System.out.println("Enter a valid number");
}
}
}
