/**
 * Week 1 - Assignment Problem 3: The Traffic Signal Streak Analyzer
 * Suggested method signature: void findLongestStreak(String signalLog)
 */
public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.length() == 0) {
            System.out.println("No signal data provided.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int maxStreak = 1;
        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);
            if (c == currentColor) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    longestColor = currentColor;
                }
                currentColor = c;
                currentStreak = 1;
            }
        }

        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestColor = currentColor;
        }

        System.out.println(String.format("Longest Streak: '%c' repeated %d times", longestColor, maxStreak));
    }

    public static void main(String[] args) {
        System.out.println("--- Sample 1 ---");
        findLongestStreak("RRGGGYRR");

        System.out.println("\n--- Sample 2 ---");
        findLongestStreak("RRRRYYGG");
    }
}
