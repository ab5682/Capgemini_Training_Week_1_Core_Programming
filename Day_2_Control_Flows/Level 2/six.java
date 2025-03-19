import java.util.*;

public class six{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter age of Amar,Akbar and Anthony : ");
int ageAmar = input.nextInt();
int ageAkbar = input.nextInt();
int ageAnthony = input.nextInt();
System.out.println("Enter height (in cm) of Amar,Akbar and Anthony : ");
int heightAmar = input.nextInt();
int heightAkbar = input.nextInt();
int heightAnthony = input.nextInt();

int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
String youngestFriend = (minAge == ageAmar) ? "Amar" : (minAge == ageAkbar) ? "Akbar" : "Anthony";

int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
String tallestFriend = (maxHeight == heightAmar) ? "Amar" : (maxHeight == heightAkbar) ? "Akbar" : "Anthony";

System.out.println("Minimum age = " + minAge);
System.out.println("Youngest = " + youngestFriend);
System.out.println("Maximum Height = " + maxHeight);
System.out.println("Tallest = " + tallestFriend); 
}
}
