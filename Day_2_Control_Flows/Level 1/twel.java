import java.util.*;
public class twel{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();

if(n<=0){
System.out.println("Enter Natural Number");
}
else{
int sumLoop=0 , i=1;
while(i<=n){
sumLoop += i;
i++;
}

int sumFormula = n * (n + 1) / 2;
System.out.println("Sum using Loop = " + sumLoop);
System.out.println("Sum using formula = " + sumFormula);
}
}
}

