import java.util.*;
public class seven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
if(num > 0){
for(int i = 1; i < num; i++){
if(num%i==0){
System.out.print(i + " ");
}
}
}else{
System.out.println("Enter a valid number");
}
}
}
