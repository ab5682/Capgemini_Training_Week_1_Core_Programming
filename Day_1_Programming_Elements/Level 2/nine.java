import java.util.*;
public class nine{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int side1 = input.nextInt();
int side2 = input.nextInt();
int side3 = input.nextInt();

int perimeter = side1 + side2 + side3;
int distance = 5000;
int rounds = distance / perimeter;

System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
}
}

