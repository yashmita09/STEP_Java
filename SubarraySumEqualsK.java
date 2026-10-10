import java.util.*;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        if (nums == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int n : nums) {
            sum += n;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }
}
