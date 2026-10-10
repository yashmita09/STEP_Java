public class ClassAttendanceTracker {
    public static String attendanceSummary(int[] days) {
        if (days == null) return "Present: 0, Longest streak: 0";
        int present = 0, curr = 0, max = 0;
        for (int d : days) {
            if (d == 1) {
                present++; curr++;
                if (curr > max) max = curr;
            } else curr = 0;
        }
        return "Present: " + present + ", Longest streak: " + max;
    }
    public static void main(String[] args) {
        System.out.println(attendanceSummary(new int[]{1, 1, 0, 1, 1, 1, 0, 1}));
    }
}
