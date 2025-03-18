import java.util.*;

public class UnitPrice{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int unitPrice = input.nextInt();
int quantity = input.nextInt();
int totalPrice = quantity * unitPrice;
System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
}
}


