import java.util.*;

/**
 * Problem 5: Pair With Target Sum (Unsorted)
 * Determines if any two distinct elements sum to target.
 * Approach 1 (Hash Set): O(n) time, O(n) space.
 * Approach 2 (Sort + Two Pointers): O(n log n) time, O(1) space.
 */
public class PairWithTargetSumUnsorted {
    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[]{2, 7, 11, 15}, 9)); // true
        System.out.println(hasPairWithSum(new int[]{3, 4, 6}, 20));     // false
    }
}
