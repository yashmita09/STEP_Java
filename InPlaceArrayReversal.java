import java.util.Arrays;

public class InPlaceArrayReversal {
    public static void reverseInPlace(int[] tokens) {
        if (tokens == null) return;
        int left = 0, right = tokens.length - 1;
        while (left < right) {
            int tmp = tokens[left];
            tokens[left] = tokens[right];
            tokens[right] = tmp;
            left++; right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        reverseInPlace(arr);
        System.out.println(Arrays.toString(arr));
    }
}
