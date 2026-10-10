import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeSortedArrays(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int[] res = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) res[k++] = a1[i++];
            else res[k++] = a2[j++];
        }
        while (i < n1) res[k++] = a1[i++];
        while (j < n2) res[k++] = a2[j++];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
    }
}
