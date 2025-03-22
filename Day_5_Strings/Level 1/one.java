import java.util.*;
public class one{
   public static boolean CompareUsingChatAt(String str1, String str2){
       if(str1.length()!=str2.length()){
           return false;
       }
       for(int i = 0 ; i < str1.length();i++){
           if(str1.charAt(i) != str2.charAt(i)){
               return false;
           }
       }
       return true;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter string 1 : ");
       String str1 = input.nextLine();
       System.out.println("Enter string 2 : ");
       String str2 = input.nextLine();


       boolean resultUsingCharAt = CompareUsingChatAt(str1, str2);
       boolean resultUsingEquals = str1.equals(str2);


       System.out.println("Comparison using charAt(): " + resultUsingCharAt);
       System.out.println("Comparison using equals(): " + resultUsingEquals);


       if (resultUsingCharAt == resultUsingEquals) {
           System.out.println("Both methods give the same result.");
       } else {
           System.out.println("Methods give different results.");
       }


   }
}
