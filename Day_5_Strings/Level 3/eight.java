import java.util.Scanner;

public class eight {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String input2 = scanner.nextLine();

        String text1 = input1.replaceAll("\\s+", "").toLowerCase();
        String text2 = input2.replaceAll("\\s+", "").toLowerCase();

        boolean result = areAnagrams(text1, text2);

        System.out.println("Are the two texts anagrams? " + (result ? "Yes" : "No"));

        scanner.close();
    }
}
