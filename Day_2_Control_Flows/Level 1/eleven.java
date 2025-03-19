import java.util.*;
public class eleven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double num;
double total = 0.0;

while(true){
num = input.nextDouble();

if(num <= 0){
break;
}
total += num; 
}
System.out.println(total);
}
}
