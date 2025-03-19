import java.util.*;
public class thirteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 1 - 100 : ");
int num = input.nextInt();
if(num>0 && num<100){
int i = 100;
System.out.println("Multiples of " + num + " are :");
while(i>0){
if(num%i==0){
System.out.print(i + " ");
}
i--;
}
}else{
System.out.println("Enter a valid number");
}
}
}
