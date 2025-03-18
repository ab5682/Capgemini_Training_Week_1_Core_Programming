import java.util.*;
public class eight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter Name : ");
String name = input.nextLine();

System.out.println("Enter fromCity,viaCity and toCity : ");
String fromCity = input.nextLine();
String viaCity = input.nextLine();
String toCity = input.nextLine();

System.out.println("Enter distance From to Via and Via to Final City : ");
double distanceFromToVia = input.nextDouble();
double distanceViaToFinalCity = input.nextDouble();

System.out.println("Enter time take in minutes to travel From to Via and via to Final city : ");
int timeFromToVia = input.nextInt();
int timeViaToFinalCity = input.nextInt();

double totalDistance = distanceFromToVia + distanceViaToFinalCity;
int totalTime = timeFromToVia + timeViaToFinalCity;
System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
   }
}

