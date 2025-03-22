import java.util.Scanner;

public class three {

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

    public static void displayWordLengths(String[][] wordArray) {
        System.out.println("Word\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i][0];
            int length = Integer.valueOf(wordArray[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordWithLengths = getWordsWithLength(words);
        displayWordLengths(wordWithLengths);
    }
}
