import java.util.*;

public class AreaTriangle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double base = input.nextDouble();
double height = input.nextDouble();
double areaInCm =(double) 1/2 * base * height;
double areaInInch = areaInCm/2.54;

System.out.println("The Area of the triangle in sq in is " + areaInInch + " and sq cm is " + areaInCm);
}
}
 

