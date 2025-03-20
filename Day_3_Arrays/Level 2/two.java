import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextInt();
        }

        int minAge = ages[0];
        String youngestFriend = names[0];

        int maxHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = names[i];
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}

