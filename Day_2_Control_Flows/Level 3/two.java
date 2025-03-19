import java.util.*;
public class two{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int year = input.nextInt();

if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
System.out.println(year + " : Leap Year");
}
else {
System.out.println(year + " : Not a Leap Year");
}
}
}
