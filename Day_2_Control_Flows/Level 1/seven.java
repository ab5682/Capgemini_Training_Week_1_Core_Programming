import java.util.Scanner;

public class seven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int month = input.nextInt();
int day = input.nextInt();
boolean isSpring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
if (isSpring) {
System.out.println("It's a Spring Season");
} else {
System.out.println("Not a Spring Season");
}
}
}
