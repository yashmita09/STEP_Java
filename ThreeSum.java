import java.util.*;

public class ThreeSum {
    public static int[][] threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new int[0][0];
        Arrays.sort(nums);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    list.add(new int[]{nums[i], nums[l], nums[r]});
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++; r--;
                } else if (sum < 0) l++;
                else r--;
            }
        }
        return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] res = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (int[] t : res) System.out.println(Arrays.toString(t));
    }
}
