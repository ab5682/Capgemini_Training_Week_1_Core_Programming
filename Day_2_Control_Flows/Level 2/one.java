import java.util.*;
public class one{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if(num<1){
System.out.println("Enter a valid Number");
}
else{
System.out.println("Even Numbers :");
for(int i = 1; i <= num ; i++){
if(i%2==0){
System.out.print(i+" ");
}
}
System.out.println("\nOdd Numbers :");
for(int x = 1; x <= num; x++){
if(x%2!=0){
System.out.print(x + " ");
}
}
}
}
}

