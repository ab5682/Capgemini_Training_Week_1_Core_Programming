import java.util.Arrays;

public class one {

    public int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
        }
        return heights;
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {
        one stats = new one();
        int[] heights = stats.generateRandomHeights(11);
        System.out.println("Player Heights: " + Arrays.toString(heights));

        System.out.println("Shortest Height: " + stats.findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + stats.findTallest(heights) + " cm");
        System.out.println("Mean Height: " + stats.findMean(heights) + " cm");
    }
}
