import java.util.Scanner;

public class six {

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String str) {
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    public static void displayCharacterTypes(String[][] charArray) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i][0] + "\t\t" + charArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] result = analyzeCharacters(input);
        displayCharacterTypes(result);
    }
}
