import java.util.*;
public class one {
    public double simpleInterest(double principal, double rate, double time){
        return ((principal*rate*time)/100);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter prinicpal, rate and time(in years) : ");
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        one simpleInterest = new one();
        double sI = simpleInterest.simpleInterest(principal, rate, time);
        System.out.println("Simple Interest = " + sI);
    }
}
