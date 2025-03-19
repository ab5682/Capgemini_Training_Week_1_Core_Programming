import java.util.*;
public class fifteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();

if(num<=0){
System.out.println("Enter a natural number");
}
else{
int total = 1;
for(int i = 1; i<=num; i++){
total *= i;
}
System.out.println(total);
}
}
}
