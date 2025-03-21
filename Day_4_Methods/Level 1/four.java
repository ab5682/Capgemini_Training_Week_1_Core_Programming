import java.util.*;
public class four {
    public int perimeter(int side1, int side2, int side3){
        return (side1+side2+side3);
    }
    
    public int rounds(int perimeter){
        int distance = 5;
        return (perimeter/distance);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of Traingle : ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        four round = new four();
        int perimeter = round.perimeter(side1, side2, side3);
        int rounds = round.rounds(perimeter);
        
        System.out.println("Total round = " + rounds);
    }
}
