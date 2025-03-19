import java.util.Scanner;
public class four{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();

if (num > 0) {
System.out.println("The sum of " + num + " natural numbers is " + (num * (num + 1) / 2));
} 
else{
System.out.println("The number " + num + " is not a natural number");
}
}
}
 

