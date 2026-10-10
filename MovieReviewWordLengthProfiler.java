/**
 * Week 1 - Assignment Problem 5: The Movie Review Word Length Profiler
 * Suggested method signature: void classifyWordLengths(String review)
 */
public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        String[] words = review.trim().split("\\s+");
        int shortCount = 0, mediumCount = 0, longCount = 0;

        for (String w : words) {
            String cleanWord = w.replaceAll("[^a-zA-Z]", "");
            int len = cleanWord.isEmpty() ? w.length() : cleanWord.length();
            if (len >= 1 && len <= 4) shortCount++;
            else if (len >= 5 && len <= 8) mediumCount++;
            else if (len >= 9) longCount++;
        }

        System.out.println(String.format("Short: %d | Medium: %d | Long: %d", shortCount, mediumCount, longCount));
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
