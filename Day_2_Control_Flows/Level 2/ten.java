import java.util.*;
public class ten{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int greatestFactor;
if(num>0){
int i = num - 1;
while(i>=1){
if(num%i==0){
greatestFactor=i;
System.out.println(greatestFactor);
break;
}
i--;
}
}else{
System.out.println("Enter a valid number");
}
}
}
