import java.util.Scanner;

public class seven {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = text.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindromeArrayMethod(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text to check for palindrome: ");
        String input = scanner.nextLine();

        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean result1 = isPalindromeIterative(normalizedInput);
        System.out.println("Using Iterative Logic: " + (result1 ? "Palindrome" : "Not Palindrome"));

        boolean result2 = isPalindromeRecursive(normalizedInput, 0, normalizedInput.length() - 1);
        System.out.println("Using Recursive Logic: " + (result2 ? "Palindrome" : "Not Palindrome"));

        boolean result3 = isPalindromeArrayMethod(normalizedInput);
        System.out.println("Using Char Array Logic: " + (result3 ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
