import java.util.*;

public class CalculateProfit{
public static void main(String[] args){

double costPrice = 129;
double sellingPrice = 191;
double profit = sellingPrice - costPrice;
double profitPercentage = (profit/costPrice) * 100;
System.out.println("The cost price is INR " + costPrice + " and selling price is INR " + sellingPrice + "\nThe profit is INR " + profit + " and the profit percentage is INR " + profitPercentage);
}
}
