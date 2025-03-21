import java.util.*;
public class six {
    public boolean CheckSpring(int month, int day){
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
        if (isSpring==true){
        return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month and date : ");
        int month = input.nextInt();
        int day = input.nextInt();

        six check = new six();
        boolean isSpring = check.CheckSpring(month, day);
        if(isSpring==true){
            System.out.println("It's Spring");
        }
        else{
            System.out.println("It's not Spring");
        }
    }
    
}
