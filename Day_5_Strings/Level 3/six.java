import java.util.Scanner;

public class six {

    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; 

            if (chars[i] == '0') {
                continue; 
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }

        String[] trimmedResult = new String[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findFrequencies(input);

        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
