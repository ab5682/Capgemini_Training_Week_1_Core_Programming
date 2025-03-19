import java.util.*;
public class nine{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int greatestFactor;
if(num>0){
for(int i = num-1; i>=1; i --){
if(num%i==0){
greatestFactor=i;
System.out.println(greatestFactor);
break;
}
}
}else{
System.out.println("Enter a valid number");
}
}
}
