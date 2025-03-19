import java.util.*;
public class thirteen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();

if(n<=0){
System.out.println("Enter Natural Number");
}
else{
int sumLoop=0;
for(int i = 1 ; i <= n ; i++){
sumLoop+=i;
}

int sumFormula = n * (n + 1) / 2;
System.out.println("Sum using Loop = " + sumLoop);
System.out.println("Sum using formula = " + sumFormula);
}
}
}

