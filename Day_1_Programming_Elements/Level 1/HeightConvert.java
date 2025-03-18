import java.util.*;

public class HeightConvert{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
float cm = input.nextFloat();
float inch = cm / 2.54f;
float feet = inch / 12f;

System.out.printf("Your Height in cm is %f while in feet is %.2f and inches is %.2f ", cm, feet, inch); 
}
}
