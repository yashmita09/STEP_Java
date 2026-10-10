/**
 * Week 1 Practice - Problem 2: Palindrome Checker (3 Approaches)
 * Suggested method signatures:
 *   boolean isPalindromeIterative(String text)
 *   boolean isPalindromeRecursive(String text)
 *   boolean isPalindromeArrayReversal(String text)
 */
public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        if (text == null) return false;
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null) return false;
        return checkRecursiveHelper(text.toLowerCase(), 0, text.length() - 1);
    }

    private static boolean checkRecursiveHelper(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return checkRecursiveHelper(s, left + 1, right - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) return false;
        String lower = text.toLowerCase();
        char[] chars = lower.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) reversed[i] = chars[chars.length - 1 - i];
        return new String(chars).equals(new String(reversed));
    }

    public static void test(String input) {
        boolean iter = isPalindromeIterative(input);
        boolean rec = isPalindromeRecursive(input);
        boolean rev = isPalindromeArrayReversal(input);
        System.out.println("\"" + input + "\"");
        System.out.println("Iterative: " + (iter ? "Palindrome" : "Not Palindrome") +
                           " | Recursive: " + (rec ? "Palindrome" : "Not Palindrome") +
                           " | Array Reversal: " + (rev ? "Palindrome" : "Not Palindrome"));
    }

    public static void main(String[] args) {
        test("madam");
        System.out.println();
        test("hello");
    }
}
