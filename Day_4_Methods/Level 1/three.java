import java.util.*;
public class three {
    public int handShakes(int numberofStudents){
        return (numberofStudents * (numberofStudents-1) / 2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int numberofStudents = input.nextInt();

        three handshake = new three();
        int hs = handshake.handShakes(numberofStudents);
        System.out.println("Total HandShakes = " + hs ); 
    }
}
