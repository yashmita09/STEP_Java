import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[(i + k) % n] = nums[i];
        System.arraycopy(res, 0, nums, 0, n);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }
}
