import java.util.Scanner;

public class four {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
        
int n = input.nextInt();           
if (n > 0) {
for (int i = 1; i <= n; i++) {
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");
} else if (i % 3 == 0) {
System.out.println("Fizz");
} else if (i % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(i);
}
}
}

else {
System.out.println("Enter a valid number");
}
}
}

