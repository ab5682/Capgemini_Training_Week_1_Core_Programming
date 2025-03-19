import java.util.*;

public class one{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int num = input.nextInt();

System.out.println("Is the number " + num + " divisible by 5 ? " + (num % 5 == 0));
}
}
