/**
 * Problem 4: Is the Queue in Order?
 * Returns index of first element smaller than its predecessor, or -1 if in non-decreasing order.
 */
public class QueueOrderChecker {
    public static int firstBreak(int[] tokens) {
        if (tokens == null || tokens.length <= 1) return -1;
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] t1 = {3, 5, 5, 8, 6, 9};
        System.out.println(firstBreak(t1)); // 4

        int[] t2 = {1, 2, 2, 7};
        System.out.println(firstBreak(t2)); // -1

        int[] t3 = {10, 9, 8};
        System.out.println(firstBreak(t3)); // 1
    }
}
