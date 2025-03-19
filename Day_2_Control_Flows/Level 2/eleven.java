import java.util.*;
public class eleven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 1 - 100 : ");
int num = input.nextInt();
if(num>0 && num<100){
System.out.println("Multiples of " + num + " are :");
for (int i = 100; i>=1; i--){
if(num%i==0){
System.out.print(i + " ");
}
}
}else{
System.out.println("Enter a valid number");
}
}
}
