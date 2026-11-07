import java.util.*;

/**
 * Problem 3: Transaction Duplicate Check
 * Time Complexity: O(n) average with HashSet
 * Space Complexity: O(n)
 * Alternative Approach: Sort in O(n log n) with O(1) extra space and check adjacent.
 */
public class TransactionDuplicateCheck {
    public static boolean hasDuplicate(List<String> transactionIds) {
        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (!seen.add(id)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> sample1 = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004");
        List<String> sample2 = Arrays.asList("TXN2001", "TXN2002", "TXN2003");

        System.out.println(hasDuplicate(sample1)); // true
        System.out.println(hasDuplicate(sample2)); // false
    }
}
