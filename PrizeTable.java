import java.util.Arrays;

/**
 * Problem 2: The Prize Table
 * Selection sort in descending order; returns number of swaps made.
 * Does not count rounds where the maximum is already in place.
 */
public class PrizeTable {
    public static int prizeTable(int[] marks) {
        int n = marks.length;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] marks1 = {45, 90, 60, 75};
        int s1 = prizeTable(marks1);
        System.out.println(Arrays.toString(marks1) + "   swaps = " + s1);

        int[] marks2 = {80, 70, 60};
        int s2 = prizeTable(marks2);
        System.out.println(Arrays.toString(marks2) + "   swaps = " + s2);

        int[] marks3 = {10, 50, 30, 20};
        int s3 = prizeTable(marks3);
        System.out.println(Arrays.toString(marks3) + "   swaps = " + s3);
    }
}
