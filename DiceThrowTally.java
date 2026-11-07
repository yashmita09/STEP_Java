import java.util.Arrays;

/**
 * Problem 5: The Dice Throw Tally
 * Counting sort for dice outcomes 1 to 6.
 * Prints counts and returns sorted array without pairwise comparisons.
 */
public class DiceThrowTally {
    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                count[roll]++;
            }
        }

        // Print Counts
        StringBuilder sb = new StringBuilder("Counts: ");
        for (int i = 1; i <= 6; i++) {
            sb.append(i).append(":").append(count[i]).append("  ");
        }
        System.out.println(sb.toString().trim());

        // Build sorted array
        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int val = 1; val <= 6; val++) {
            for (int c = 0; c < count[val]; c++) {
                sorted[index++] = val;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls = {4, 1, 6, 4, 2, 1, 4};
        int[] sorted = diceSort(rolls);
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }
}
