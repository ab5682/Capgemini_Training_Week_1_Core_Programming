import java.util.Scanner;

public class four {

    public static int[][] findCharFrequencies(String text) {
        int[] freq = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;       
                result[index][1] = freq[i]; 
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequencies = findCharFrequencies(input);

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            char character = (char) frequencies[i][0];
            int count = frequencies[i][1];
            System.out.println("'" + character + "' = " + count);
        }

        sc.close();
    }
}
