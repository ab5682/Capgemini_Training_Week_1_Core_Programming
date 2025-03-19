import java.util.*;
public class fourteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();

if(num<=0){
System.out.println("Enter a natural number");
}
else{
int total = 1;
while(num>0){
total *= num;
num--;
}
System.out.println(total);
}
}
}
