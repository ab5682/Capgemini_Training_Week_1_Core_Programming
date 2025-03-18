import java.util.*;

public class DistanceKmToMiles{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double distanceInKm = input.nextDouble();
double distanceInMiles = distanceInKm * 1.6;
System.out.println("The total miles is " + distanceInMiles + " mile for the given " + distanceInKm + " km " );
}
}

