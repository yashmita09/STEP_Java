/**
 * Problem 9: Pair Sum in a Sorted Array
 * Two-pointer technique on sorted array.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class PairSumSortedArray {
    public static String pairSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return "(" + nums[left] + ", " + nums[right] + ")";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        int[] sample1 = {-4, -1, 0, 3, 5, 9};
        System.out.println(pairSumSorted(sample1, 4)); // (-1, 5)

        int[] sample2 = {1, 2, 3};
        System.out.println(pairSumSorted(sample2, 100)); // Not Found
    }
}
