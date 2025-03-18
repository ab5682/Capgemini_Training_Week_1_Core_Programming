import java.util.*;

public class VolumeEarth{
public static void main(String[] args){

int radius = 6378;
float volumeInKm = 4/3f * 22/7f * radius * radius * radius;
float volumeInMiles = volumeInKm * 1.6f;
System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n " , volumeInKm, volumeInMiles);
}
}
