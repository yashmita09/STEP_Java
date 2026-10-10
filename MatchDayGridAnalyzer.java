public class MatchDayGridAnalyzer {
    public static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        int sum = 0;
        for (int v : row) sum += v;
        return (double) sum / row.length;
    }
    public static String classifyMatches(int[][] runs, int threshold) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < runs.length; i++) {
            String st = rowAverage(runs[i]) >= threshold ? "Power Surge" : "Normal";
            sb.append("Match ").append(i).append(": ").append(st);
            if (i < runs.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[][] r = {{4, 6, 8}, {10, 12, 14}, {2, 3, 1}};
        System.out.println(classifyMatches(r, 8));
    }
}
