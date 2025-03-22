import java.util.Scanner;

public class five {

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

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
    }
}
