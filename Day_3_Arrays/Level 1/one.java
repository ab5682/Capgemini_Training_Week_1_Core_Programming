import java.util.*;
public class one{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentage = new int[10];
        for(int i = 0; i<10; i++){
            System.out.println("Enter student's age : ");
            studentage[i] = input.nextInt();
        }
        for(int i = 0; i<10; i++){
            if(studentage[i]>=18){
                System.out.println("The student with the age " + studentage[i] + " can vote");
            }else{
                System.out.println("The student with the age " + studentage[i] + " cannot vote");
            }
        }
    }
}
