import java.util.Arrays;

/**
 * Selection Sort Implementation
 * Time: O(n^2) in all cases
 * Space: O(1) in-place
 * Stable: No
 */
public class SelectionSort {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int t = a[i];
                a[i] = a[minIdx];
                a[minIdx] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        System.out.println("Selection Sort Result: " + Arrays.toString(arr));
    }
}
