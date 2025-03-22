import java.util.Scanner;

public class four {

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitTextIntoWords(String text) {
        String word = "";
        int len = getStringLength(text);
        String[] temp = new String[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    temp[index++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            temp[index++] = word;
        }

        String[] words = new String[index];
        for (int i = 0; i < index; i++) {
            words[i] = temp[i];
        }
        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLen = Integer.valueOf(wordArray[0][1]);
        int maxLen = Integer.valueOf(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int len = Integer.valueOf(wordArray[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordArray[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordArray[i][0];
            }
        }
        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordWithLengths = getWordsWithLength(words);
        String[] result = findShortestAndLongest(wordWithLengths);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
