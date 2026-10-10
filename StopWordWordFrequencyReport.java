import java.util.*;

/**
 * Week 2 - Assignment Problem 5: Stop-Word-Filtered Word Frequency Report
 * Suggested method signature: void printFilteredWordFrequency(String feedback)
 */
public class StopWordWordFrequencyReport {

    private static final Set<String> STOP_WORDS = new HashSet<>(
            Arrays.asList("the", "was", "and", "a", "is", "of", "in")
    );

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) return;
        String cleaned = feedback.toLowerCase().replaceAll("[.,!?;:]", "");
        String[] words = cleaned.trim().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (!w.isEmpty() && !STOP_WORDS.contains(w)) {
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
