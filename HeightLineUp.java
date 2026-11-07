import java.util.Arrays;

/**
 * Problem 1: The Height Line-Up
 * Sorts array using Bubble Sort, printing the whole line after every sweep.
 * Stops early if a sweep makes no swap.
 */
public class HeightLineUp {
    public static void lineUp(int[] heights) {
        int n = heights.length;
        for (int pass = 1; pass <= n - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        int[] h1 = {4, 2, 5, 1};
        lineUp(h1);

        System.out.println("\nTest Case 2:");
        int[] h2 = {1, 3, 2, 4};
        lineUp(h2);

        System.out.println("\nCustom Test Case:");
        int[] h3 = {5, 4, 3, 2, 1};
        lineUp(h3);
    }
}
