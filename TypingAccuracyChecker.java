/**
 * Week 1 - Assignment Problem 2: The Typing Speed Test Accuracy Checker
 * Suggested method signature: void checkTypingAccuracy(String original, String typed)
 */
public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input: Strings cannot be null.");
            return;
        }

        int totalChars = original.length();
        if (totalChars != typed.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }

        if (totalChars == 0) {
            System.out.println("Matched: 0/0 | Accuracy: 100.00% | No Mismatches");
            return;
        }

        int matchedCount = 0;
        int firstMismatchPos = -1;
        char origMismatch = ' ', typedMismatch = ' ';

        for (int i = 0; i < totalChars; i++) {
            char o = original.charAt(i);
            char t = typed.charAt(i);
            if (o == t) {
                matchedCount++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
                origMismatch = o;
                typedMismatch = t;
            }
        }

        double accuracy = ((double) matchedCount / totalChars) * 100.0;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Matched: %d/%d | Accuracy: %.2f%% | ", matchedCount, totalChars, accuracy));
        if (firstMismatchPos != -1) {
            sb.append(String.format("First Mismatch at position %d ('%c' vs '%c')", firstMismatchPos, origMismatch, typedMismatch));
        } else {
            sb.append("No Mismatches");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println("--- Sample 1 ---");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\n--- Sample 2 ---");
        checkTypingAccuracy("coding", "coding");
    }
}
