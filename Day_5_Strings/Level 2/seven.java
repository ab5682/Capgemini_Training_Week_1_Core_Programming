import java.util.Scanner;

public class seven {

    public static int[] getTrimIndexes(String str) {
        int start = 0;
        int end = 0;
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                str1.charAt(len1);
                len1++;
            }
        } catch (Exception e) {}

        try {
            while (true) {
                str2.charAt(len2);
                len2++;
            }
        } catch (Exception e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        int[] trimIndexes = getTrimIndexes(input);
        String customTrimmed = customSubstring(input, trimIndexes[0], trimIndexes[1]);
        String builtInTrimmed = input.trim();

        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("Custom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + areEqual);
    }
}
