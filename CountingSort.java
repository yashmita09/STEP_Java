import java.util.Arrays;

/**
 * Counting Sort Implementation
 * Non-comparison based integer sort
 * Time: O(n + k) where k is range
 * Space: O(n + k)
 * Stable: Yes
 */
public class CountingSort {
    public static void countingSort(int[] a) {
        if (a == null || a.length <= 1) return;
        int min = a[0], max = a[0];
        for (int v : a) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[a.length];

        for (int v : a) {
            count[v - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[a[i] - min] - 1] = a[i];
            count[a[i] - min]--;
        }
        System.arraycopy(output, 0, a, 0, a.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Counting Sort Result: " + Arrays.toString(arr));
    }
}
