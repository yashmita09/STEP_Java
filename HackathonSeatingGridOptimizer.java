public class HackathonSeatingGridOptimizer {
    public static double rowAverage(int[] row) {
        int sum = 0;
        for (int s : row) sum += s;
        return (double) sum / row.length;
    }
    public static String classifyRows(int[][] grid, int threshold) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            String z = rowAverage(grid[i]) < threshold ? "Quiet Zone" : "Buzzing Zone";
            sb.append("Row ").append(i).append(": ").append(z);
            if (i < grid.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[][] g = {{40, 50, 45}, {85, 90, 95}, {30, 20, 25}};
        System.out.println(classifyRows(g, 60));
    }
}
