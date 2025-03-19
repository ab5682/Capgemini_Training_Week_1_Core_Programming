import java.util.*;
public class eight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if(num > 0){
int i = 1;
while(i < num){
if(num%i==0){
System.out.print(i + " ");
}
i++;
}
}else{
System.out.println("Enter a valid number");
}
}
}
