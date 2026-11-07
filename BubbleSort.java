import java.util.Arrays;

/**
 * Bubble Sort Implementation
 * Time: O(n^2) worst/avg, O(n) best
 * Space: O(1) in-place
 * Stable: Yes
 */
public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - pass; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Bubble Sort Result: " + Arrays.toString(arr));
    }
}
