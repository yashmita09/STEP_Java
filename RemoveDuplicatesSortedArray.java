import java.util.Arrays;

/**
 * Problem 10: Remove Duplicates From a Sorted Array In-Place
 * Two pointers: writes unique values in-place.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int writeIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("length = " + length);
        System.out.print("nums[0.." + (length - 1) + "] = [");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + (i < length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
