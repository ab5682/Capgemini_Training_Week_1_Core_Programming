import java.util.*;
public class ten{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double num ;
double total = 0.0;

while( (num = input.nextDouble()) != 0){
total += num;
}
System.out.println(total);
}
}
